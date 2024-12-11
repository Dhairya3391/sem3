class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
    }
}
class BST
{
    public Node insert(Node root,int data)
    {
        if(root==null)
        {
            root=new Node(data);
            System.out.println("Root = "+data);
            return root;
        } 
        else{
            if(root.data>data)
            {
                root.left=insert(root.left,data);
                System.out.println("Root.left = "+data);
            }
            else{
                root.right=insert(root.right,data);
                System.out.println("Root.right = "+data);
            }
        }
        return root;
    }
    
    public  void inorder(Node root)
    {
        if(root==null)
        {
           return; 
        }
        inorder(root.left);
        System.out.print(" "+root.data);
        inorder(root.right);
    }

     public  void preorder(Node root)
    {
        if(root==null)
        {
           return; 
        }
        System.out.print(" "+root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public  void postorder(Node root)
    {
        if(root==null)
        {
           return; 
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(" "+root.data);
    }
}
class BST1 {
    public static void main(String[] args)
    {
        Node root=null;
        BST bst=new BST();
        root=bst.insert(root,10);
        root=bst.insert(root,5);
        root=bst.insert(root,7);
        root=bst.insert(root,15);
        root=bst.insert(root,50);
        root=bst.insert(root,17);

        System.out.println("Inorder = ");
        bst.inorder(root);
        System.out.println(root.data);

        bst.preorder(root);
         System.out.println();
        bst.postorder(root);
        System.out.println();
    }
}
