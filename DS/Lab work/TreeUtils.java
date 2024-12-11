public class TreeUtils {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; left = right = null; }
    }

    public static Node insert(Node root, int data) {
        if (root == null) return new Node(data);
        if (data < root.data)
            root.left = insert(root.left, data);
        else if (data > root.data)
            root.right = insert(root.right, data);
        return root;
    }

    public static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public static Node search(Node root, int key) {
        if (root == null || root.data == key)
            return root;
        if (root.data > key)
            return search(root.left, key);
        return search(root.right, key);
    }
}