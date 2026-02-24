
// import java.util.Stack;

// public class infix 
// {
//     public static void main(String[] args)
//     {
//         String str="4+6-2*2/4";
//         Stack<Integer> val=new Stack<>();
//         Stack<Character> op=new Stack<>();
//         for(int i=0;i<str.length();i++)
//         {
//             char ch=str.charAt(i);
//             int ascii=(int)ch;

//             if(ascii >=48 && ascii <=57)
//             {
//                 val.push(ascii-48);
//             }
//             else if(op.isEmpty())
//             {
//                 op.push(ch);
//             }
//             else
//             {
//                  if(ch=='+' || ch=='-')
//                  {
//                      int v2=val.pop();
//                      int v1=val.pop();
//                      if(op.peek()=='-') val.push(v1-v2);
//                      if(op.peek()=='+') val.push(v1+v2);
//                      if(op.peek()=='*') val.push(v1*v2);
//                      if(op.peek()=='/') val.push(v2/v1);
//                      op.pop();
//                      op.push(ch);
//                  }

//                  if(ch=='*' || ch=='/')
//                  {
//                      if(op.peek()=='*' || op.peek()=='/')
//                      {
                        
//                         int v2=val.pop();
//                      int v1=val.pop();
//                      if(op.peek()=='-') val.push(v1-v2);
//                      if(op.peek()=='+') val.push(v1+v2);
//                      if(op.peek()=='*') val.push(v1*v2);
//                      if(op.peek()=='/') val.push(v2/v1);
//                      op.pop();
//                      op.push(ch); 
//                      }
//                      else
//                      {
                       
//                         op.push(ch);
//                      }
//                  }
                
//             }
            

//         }
//         while(val.size()>1)
//             {
//                      int v2=val.pop();
//                      int v1=val.pop();
//                      if(op.peek()=='-') val.push(v1-v2);
//                      if(op.peek()=='+') val.push(v1+v2);
//                      if(op.peek()=='*') val.push(v1*v2);
//                      if(op.peek()=='/') val.push(v2/v1);
                    
//             }
//             System.out.println(val.peek());

//     }   
// }
import java.util.Stack;

public class infix {
    public static void main(String[] args) {
        String str = "4-(5+6)*12/4";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57)  
            {
                 String st=" "+ch;
            }
            else if (op.isEmpty() || ch=='(' || op.peek()=='(') 
            {
                op.push(ch);
            }
            else if(ch==')')
            {
                while (!op.isEmpty() && op.peek()!='(') 
            {
                  
                }
                op.pop();
            }
            else 
            {
                if (ch == '+' || ch == '-') 
                {
                    while (!op.isEmpty()) {
                        String  v2 = val.pop();
                        String v1 =val.pop();
                        char op1 = op.pop();
                        String s= op1 + v1 +v2;
                    }
                    op.push(ch);
                }
                else if (ch == '*' || ch == '/') 
                {
                    while (!op.isEmpty() && (op.peek() == '*' || op.peek() == '/')) 
                    {
                        String  v2 = val.pop();
                    String v1 =val.pop();
                    char op1 = op.pop();
                    String s= op1 + v1 +v2;
                    }
                    op.push(ch);
                }
            }
        }

        while (!op.isEmpty()) 
        {
            String  v2 = val.pop();
            String v1 =val.pop();
            char op1 = op.pop();
            String s= op1 + v1 +v2;
        }


        String res=val.pop();
        System.out.println(res);
    }

}

