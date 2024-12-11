import java.util.*;

class node {
    int data;
    node nxt;

    node(int x) {
        data = x;
        nxt = null;
    }

}

class Singlylinkedlist {
    node first = null;

    void insert_s(int x) {

        node n1 = new node(x);
        if (first == null) {
            first = n1;
            n1.nxt = null;
            return;
        } else {
            n1.nxt = first;
            first = n1;
        }

    }

    void insert_e(int x) {
        node n2 = new node(x);
        if (first == null) {
            first = n2;
            n2.nxt = null;
            return;
        } else {
            node save = first;
            while (save.nxt != null) {
                save = save.nxt;
            }
            save.nxt = n2;
            n2.nxt = null;
        }
    }

    void insert_o(int x) {
        node n3 = new node(x);
        if (first == null) {
            first = n3;
            n3.nxt = null;
            return;
        }

        if (first.data < x) {
            node curr = first;
            while (curr.data < x) {
                if (curr.nxt == null) {
                    n3.nxt = curr.nxt;
                    curr.nxt = n3;
                }
                curr = curr.nxt;
            }
            n3.nxt = curr.nxt;
            curr.nxt = n3;
        } else {
            n3.nxt = first;
            first = n3;
        }
    }

    void disp() {
        node curr = first;
        while (curr.nxt != null) {
            curr = curr.nxt;
            System.out.println("Element is" + curr.data);
        }
    }

    public static void main(String args[]) {
        Singlylinkedlist l1 = new Singlylinkedlist();
        l1.insert_s(7);
        l1.insert_e(8);
        l1.disp();

    }

}
