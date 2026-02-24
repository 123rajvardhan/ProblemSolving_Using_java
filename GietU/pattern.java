import java.util.*;
public class pattern
 {
     public static void main(String[] args) 
     {
        Scanner s=new Scanner(System.in);  
        int n=s.nextInt();
        int k=1;
        int l=2;
        for(int i=1;i<=n;i++)
        {
           
            for(int j=1;j<=i;j++)
            {
               if(i%2!=0)
               {
                 System.out.print(k);
                 k=k+2;
               }
               else{
                  System.out.print(l);
                  l=l+2;
               }
            }
            System.out.println();
        }

     }  
}
