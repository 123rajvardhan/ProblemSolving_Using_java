package stack;
import java.util.*;
public class a1 
{
   public static void main(String[] args) 
   {
      Stack s=new Stack<>();
      s.push("1");
      s.push("2");
      s.push("3");
      System.out.println(s);
      System.out.println(s.search("1"));
     // System.out.println(s.peek());
      System.out.println(s.pop());
      System.out.println(s.search("5"));
      s.close()

   }   
}
