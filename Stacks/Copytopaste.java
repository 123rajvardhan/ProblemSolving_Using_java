
import java.util.Stack;


public class Copytopaste 
{
   public static void main(String[] args) 
   {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> vt=new Stack<>();
   
    st.push(1); 
    st.push(3); 
    st.push(5); 
   System.out.println(st);
    while(st.size()>0)
    {
         
         vt.push(st.pop());
         

    }
    System.out.println(vt);
   
   while(vt.size()>0)
   { int x=vt.pop();
     System.out.println(x);
        st.push(x);
   }
    System.out.println(st);
    
   }
}
