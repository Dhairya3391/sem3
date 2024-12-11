public class QueueUtils<T> {
    public Object[] elements;
    int front, rear, size;
    int capacity = 10;

    public QueueUtils() {
        elements = new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(T item) {
        if (size == elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            System.arraycopy(elements, front, newElements, 0, elements.length - front);
            System.arraycopy(elements, 0, newElements, elements.length - front, rear + 1);
            elements = newElements;
            front = 0;
            rear = size - 1;
        }
        rear = (rear + 1) % elements.length;
        elements[rear] = item;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T item = (T) elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return item;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return (T) elements[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}