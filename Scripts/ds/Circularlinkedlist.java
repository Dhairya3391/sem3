import java.util.*;

class node {
    int data;
    node nxt;

    node(int x) {
        data = x;
        nxt = null;
    }

}
public class Circularlinkedlist {
    node first = null;

    void insert_f(int x) {

        node n1 = new node(x);
        if (first == null) {
            first = n1;
            n1.nxt = n1;
            return;
        } else {
            node last = first;

            while (last.nxt != first) {
                last = last.nxt;
            }
            n1.nxt = first;
            first = n1;
            last.nxt = n1;
        }

    }

    void insert_e(int x) {
        node n2 = new node(x);
        if (first == null) {
            first = n2;
            n2.nxt = first;
            return;
        } else {
            node last = first;
            while (last.nxt != first) {
                last = last.nxt;

            }
            last.nxt = n2;
            n2.nxt = first;
            return;
        }
    }

 

    public static void main(String args[]) {
        Circularlinkedlist l1 = new Circularlinkedlist();
        l1.insert_e(8);
        l1.insert_f(10);
        disp(l1);
    }
   static void disp(Circularlinkedlist l1) {
        node curr = l1.first;
        do {
            System.out.println("Element is" + curr.data);
            curr = curr.nxt;

        } while (curr != l1.first);

    }
}
