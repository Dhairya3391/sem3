public class LinkedListUtils {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    public static Node insertAtBeginning(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    public static Node deleteNode(Node head, int key) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            return temp.next;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return head;
        prev.next = temp.next;
        return head;
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}