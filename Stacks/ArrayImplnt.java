

public class ArrayImplnt 
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

     System.out.println( st.size() + "is length of stack");
      st.isEmpty();
      st.isFull();  
  }  
   static  class Stack
  {
      int arr[]=new int[5];
      int idx=0;

      void push(int x)
      {
        if(isFull())
        {
           System.out.print("stack is full");
           return ;
        }
         arr[idx]=x;
         idx++;
      }
      int peek()
      {
         if(isEmpty())
         {
            System.out.println("stack is empty");
            return -1;  
         }
         if(idx==0)
         {
            System.out.print("stack is empty");
          return -1;
         }
          int top=arr[idx-1];
          return top;
      }
      int pop()
      {
        if(idx==0)
         {
            System.out.print("stack is empty");
          return -1;
         }
         int top=arr[idx-1];
         arr[idx-1]=0;
         idx--;
         return top;
      }
      void display()
      {
         for (int i = 0; i <idx; i++) 
         {
             System.out.print(arr[i] + " ");

         }
         System.out.println();
      }

      int size()
      {
        return idx; 
      }
      boolean isEmpty()
      {
        if(size()==0)
        {
          return false;
        }
        else
        {
          return true;
        }
      }
      boolean isFull()
      {
         if(idx==arr.length)
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

