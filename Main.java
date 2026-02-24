public class Main {
    public static void main(String[] args) 
    {
       BinaryTree tree =new BinaryTree();
       
       tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder:");
        tree.preOrder(tree.root);

        System.out.println("\nInorder:");
        tree.inorder(tree.root);

        System.out.println("\nPostorder:");
        tree.postorder(tree.root);

        System.out.println("\nLevel Order:");
        tree.levelorder(tree.root);
    }
}
