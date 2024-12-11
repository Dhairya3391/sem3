
class node {
    int data;
    node lptr, rptr;

    node(int data) {
        this.data = data;
        // lptr=null;
        // rptr=null;
    }

}

class Bst {
    node n1 = new node(data);

    void insert(int data) {

        if (root == null) {
            root = n1;
            System.out.println("The Root is " + root.data);
            return root;
        } else if (n1.data < root.data) {
            root.lptr = n1;
            root.lptr.data = n1.data;
            System.out.println("New node inserted left" + root.lptr.data);
        } else if (n1.data > root.data) {
            root.rptr = n1;
            root.lptr.data = n1.data;
            System.out.println("New node inserted right");
        } else {
            System.out.println(data + "is Dupilcate");
        }
        return root;
    }

    void inorder(node root) {
        if (root == null) {
            System.out.println("No Tree exist");

        }

        inorder(root.lptr);
        System.out.println(root.data);
        inorder(root.rptr);

    }

    public static void main(String[] args) {

        Bst t1 = new Bst();
        root = t1.insert(15);
        root = t1.insert(5);
        root = t1.insert(12);
        // root = t1.insert(15);
        t1.inorder(root);

    }
}
