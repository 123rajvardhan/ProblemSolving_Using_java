import java.util.*;
public class SumOdd 
{
    public static void main(String[] args) 
    {
         Scanner s=new Scanner(System.in);

         int n=s.nextInt();
  int os=0,es=0;
         int temp=n;
         while(temp>0)
         {
             int rem=temp%10;
             if(rem%2==0)
             {
                 es+=rem;
             }
             else
             {
                  os+=rem;
             }
             temp=temp/10;
         }
         if(es==os)
         {
            System.out.println("Yes");
         }
         else
         {
            System.out.println("No");
         }
    }
}
