import java.util.*;

class node {
    int data;
    node nxt;

    node(int x) {
        data = x;
        nxt = null;
    }

}

public class Linkedlist_stack {
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

    void Delete_e() {
        if (first == null) {
            System.out.println("Linkedlist does not exits ");
        } else {
            node save = first;
            while (save.nxt.nxt != null) {
                save = save.nxt;
            }
            save.nxt = null;
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
        Linkedlist_stack l1 = new Linkedlist_stack();
        l1.insert_e(8);
        l1.insert_e(10);
        l1.insert_e(12);
        l1.Delete_e();
        l1.disp();

    }
}
