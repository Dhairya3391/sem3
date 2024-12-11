import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data) 
    {
        this.data = data;
        this.next = null;
    }
}

class CircularLk {
    Node head; 

    CircularLk() 
    {
        this.head = null;
    }

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) 
        {
            head = newNode;
            newNode.next = head; 
        } 
        else 
        {
            Node temp = head;
            while (temp.next != head) 
            {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) 
        {
            head = newNode;
            newNode.next = head; 
        } else 
        {
            Node temp = head;
            while (temp.next != head) 
            {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }
    void deleteLastNode() {
        if (head == null || head.next == head) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != head) {
                temp = temp.next;
            }
            temp.next = head;
        }
    }
    void deleteFirstNode() {
        if (head == null || head.next == head) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
        }
    }
}

public class CircularLinkList {
    public static void main(String[] args) {
        CircularLk list = new CircularLk();

        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);
        list.insertAtBeginning(21);


        displayList(list);

        list.deleteLastNode();
        list.deleteFirstNode();

        displayList(list);
    }

    static void displayList(CircularLk list) {
        if (list.head == null) {
            System.out.println("Circular Linked List is empty");
            return;
        }

        Node temp = list.head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != list.head);
        System.out.println();
    }
}
