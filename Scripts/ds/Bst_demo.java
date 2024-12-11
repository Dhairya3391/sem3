
class node {
    int data;
    node lptr, rptr;

    node(int data) {
        this.data = data;

    }

}

public class Bst_demo {
    static node root = null;

    void insert(node root, int data) {

        node n1 = new node(data);
        if (root == null) {
            root = n1;
            System.out.println("The Root is " + root.data);
        } else if (n1.data < root.data) {
            root.lptr = n1;
            System.out.println("New node inserted left" + data);
        } else if (n1.data > root.data) {
            root.rptr = n1;

            System.out.println("New node inserted right" + data);
        } else {
            System.out.println(data + " is Dupilcate" + data);
        }
    }

    void inorder(node root) {

        if (root == null) {
            System.out.println("No Tree exists");
        }
        inorder(root.lptr);
        System.out.println(root.data);
        inorder(root.rptr);

    }

    public static void main(String[] args) {

        Bst_demo b1 = new Bst_demo();
        b1.insert(root, 12);
        b1.insert(root, 13);
        b1.insert(root, 11);
        // b1.insert(12);

        b1.inorder(root);

    }
}
