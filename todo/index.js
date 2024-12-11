const express = require('express');
const fs = require('fs');
const path = require('path');
const app = express();

app.use(express.static(path.join(__dirname, 'public')));
app.use(express.json());
const filePath = 'items.txt';
function readItemsFromFile() {
    try {
        const data = fs.readFileSync(filePath, 'utf8');
        return JSON.parse(data || '[]');
    } catch (err) {
        return [];
    }
}
function writeItemsToFile(items) {
    fs.writeFileSync(filePath, JSON.stringify(items, null, 2), 'utf8');
}
app.get('/api/items', (req, res) => {
    const items = readItemsFromFile();
    res.json(items);
});
app.post('/api/items', (req, res) => {
    const { name } = req.body;
    if (!name) {
        return res.status(400).json({ error: 'Item name is required' });
    }

    const items = readItemsFromFile();
    const newItem = {
        id: Date.now(),
        name,
        time: new Date().toISOString()
    };

    items.push(newItem);
    writeItemsToFile(items);
    res.status(201).json(newItem);
});
app.delete('/api/items/:id', (req, res) => {
    const { id } = req.params;
    const items = readItemsFromFile();

    const updatedItems = items.filter(item => item.id !== parseInt(id, 10));

    if (updatedItems.length === items.length) {
        return res.status(404).json({ error: 'Item not found' });
    }

    writeItemsToFile(updatedItems);
    res.status(204).send();
});
const PORT = 3000;
app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});
