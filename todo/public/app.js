// API Endpoints
const API_URL = '/api/items';

// Fetch all items and display them
async function fetchItems() {
    const response = await fetch(API_URL);
    const items = await response.json();

    const itemsList = document.getElementById('items-list');
    itemsList.innerHTML = '';  // Clear the list before re-rendering

    items.forEach(item => {
        const li = document.createElement('li');
        li.innerHTML = `
            <span>${item.name} (${item.time})</span>
            <button class="delete" onclick="deleteItem(${item.id})">Delete</button>
        `;
        itemsList.appendChild(li);
    });
}

// Add a new item
document.getElementById('add-item-form').addEventListener('submit', async (event) => {
    event.preventDefault();
    
    const itemName = document.getElementById('item-name').value;
    
    if (!itemName) {
        alert('Item name is required');
        return;
    }

    const response = await fetch(API_URL, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({ name: itemName }),
    });

    const newItem = await response.json();
    fetchItems();  // Refresh the item list
    document.getElementById('item-name').value = '';  // Clear input field
});

// Delete an item
async function deleteItem(id) {
    const response = await fetch(`/api/items/${id}`, {
        method: 'DELETE',
    });

    if (response.status === 204) {
        fetchItems();  // Refresh the item list
    } else {
        alert('Item not found');
    }
}

// Initialize the app
fetchItems();
