import java.util.*;

public class BinaryTree 
{
       Node root;

    public BinaryTree() 
    {
         root=null;
    }

    void preOrder(Node node)
    {
       if(node==null)
       {
            return;
       }

       System.out.print(node.data);

       preOrder(node.left);
       preOrder(node.right);
    }

    void inorder(Node node)
    {
        if(node==null)
        {
            return;
        }

        inorder(node.left);

        System.out.print(node.data);

        inorder(node.right);
    }

    void postorder(Node node)
    {
       if(node==null)
       {
            return;
       }
       postorder(node.left);
       postorder(node.right);
       System.out.print(node.data);
    }
       
    void levelorder(Node node)
    {
        if(node==null)
        {
            return;
        }

        Queue<Node> queue =new LinkedList<>();


           queue.add(node);

           while(!queue.isEmpty())
           {
                Node current = queue.poll();

                System.out.print(current.data);


                if(current.left!=null)
                {
                  queue.add(current.left);
                }
                if(current.right!=null)
                queue.add(current.right);
           }
    }
}

class Node
{
     int data;
      Node left;
      Node right;
      
      Node(int data)
      {
         this.data =data;
         this.left=null;
         this.right=null;
      }
      
}
