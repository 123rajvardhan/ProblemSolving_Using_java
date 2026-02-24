import java.util.Stack;

public class DisplayStack 
{
    // public static void display(Stack<Integer> st)
    // {
    //     if(st.size()==0)
    //     {
    //         return;    
    //     }
    //     int top=st.pop();
    //     System.out.println(top);
    //     display(st);
    //     st.push(top);
        
    // }
    public static void pushBottom(Stack<Integer> st)
    {
        if(st.size()==0)
        {
            st.push(6);
            return;
        }
        int top=st.pop();

        pushBottom(st);
        System.out.println(top);
        st.push(top);
        
        
    }

   public static void main(String[] args) {
    Stack<Integer> st=new Stack<>();
    // Stack<Integer> vt=new Stack<>();
   
    st.push(1); 
    st.push(2); 
    st.push(3); 
    st.push(4); 
    st.push(5); 
     pushBottom(st);
     System.out.print(st);
//     int n=st.size();
//     int arr[]=new int[n];
//     for(int i=n-1;i>=0;i--)
//     {
//         arr[i]=st.pop();
//     }
//     for (int i = 0; i <n; i++) {
//         System.out.println(arr[i]);
//     }
//    } 
}
}
