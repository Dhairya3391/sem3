import java.util.*;

class node {
    int data;
    node nxt;

    node(int x) {
        data = x;
        nxt = null;
    }

}

public class Linkedlist_queue {
    node first = null;

    void insert_e(int x) {
        node n1 = new node(x);
        if (first == null) {
            first = n1;
            n1.nxt = null;
            return;
        } else {
            node save = first;
            while (save.nxt != null) {
                save = save.nxt;
            }
            save.nxt = n1;
            n1.nxt = null;
        }
    }

    void delete_f() {
        if (first == null) {
            System.out.println("Linkedlist does not exits");
            return;
        }
        if (first.nxt == null) {
            first = null;
            System.out.println("Linkedlist Empty");
            return;
        } else {
            first = first.nxt;
            return;
        }

    }

    void disp() {
        node curr = first;
        while (curr != null) {
            System.out.println("Element is" + curr.data);
            curr = curr.nxt;

        }

    }

    public static void main(String args[]) {
        Linkedlist_queue l1 = new Linkedlist_queue();
        l1.insert_e(8);
        l1.insert_e(10);
        l1.insert_e(12);
        l1.delete_f();
        l1.disp();

    }

}
