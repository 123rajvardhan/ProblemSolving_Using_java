// import java.util.Stack;

public class LlIpmlnt 
{
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(2);
      st.display();
      st.push(3);
      st.display();
      st.push(4);
      st.display();
      st.pop();
      st.display();
      System.out.println( st.peek() + "is peek element");

    }
    public static class Node
    {
        int val;
        Node next;
     

        public Node(int val)
        {
            this.val=val;
        }
    }

    public static class Stack
    {
        Node head=null;
        int size=0;
        void push(int x)
        {
            
             Node n=new Node(x);
            
             Node temp=n;

             temp.next=head;
             head=temp;
             size++;
        }

        int peek()
        {
            return head.val;
        }
        int pop()
        { 
           
            int x=head.val;
            head=head.next;
            return x;
        }

        // void displayReverse()
        // {
        //      Node temp=head;

        //      while(temp!=null)
        //      {
        //          System.out.print(temp.val);
        //          temp=temp.next;
        //      }
        //      System.out.println();
        // }
        void  displayrecusr(Node h)
        {
           if(h==null)
           {
            return ;
           }
           displayrecusr(h.next );
           System.out.print(h.val + " ");
        }
        void  display()
        {
            displayrecusr(head);
            System.out.println();
        }
        
        int size()
        {
            return size;
        }

        boolean isEmpty()
        {
            if(size==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        
    }
}
