//BST
import java.util.*;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // insert
    static Node insertNode(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        } else if (root.data > data) {
            root.left = insertNode(root.left, data);
        } else if (root.data < data) {
            root.right = insertNode(root.right, data);
        }
        return root;
    }

    // inOrder
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left); // Traverse the left subtree,
        System.out.print(root.data + " ");// Visit the root.
        inOrder(root.right);// Traverse the right subtree,

    }

    // preOrder
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");// Visit the root.
        preOrder(root.left);// Traverse the left subtree,
        preOrder(root.right);// Traverse the right subtree,
    }

    // postOrder
    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);// Traverse the left subtree,
        postOrder(root.right);// Traverse the right subtree,
        System.out.print(root.data + " ");// Visit the root.
    }

    // search
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return search(root.left, key);
        }
        if (root.data == key) {
            return true;
        } else {

            return search(root.right, key);
        }
    }

    // delete
    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data == val) {
            // case 1: delete
            if (root.right == null && root.left == null) {
                return null;
            }

            // case 2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3
            Node IS = inOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    // inorderSuccessor for delete
    public static Node inOrderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };

        Node root = null;

        // insert nodes in tree
        // for (int val : values) {
        // root = insertNode(root, val);
        // }

        // print tree using inorder traversal
        System.out.print("inOrder traversal :");
        inOrder(root);
        System.out.println();

        // print tree using preorder traversal
        System.out.print("preOrder traversal :");
        preOrder(root);
        System.out.println();

        // print tree using postorder traversal
        System.out.print("postOrder traversal :");
        postOrder(root);
        System.out.println();

        // search in tree
        if (search(root, 3)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }

        // delete node from tree
        delete(root, 10);
        inOrder(root);
        System.out.println();

    }

}