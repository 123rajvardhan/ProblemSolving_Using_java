import java.util.*;
public class pat3 
{
  
  public static void main(String[] args) 
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
   
     int a=1;
     int k=n*(n+1),c2=0;
    for(int i=1;i<=n;i++)
    {
        for(int sp=1;sp<=i-1;sp++)
        {
             System.out.print(" ");
        }
        
          for(int j=1;j<=(n+1)-i;j++)
          {
             System.out.print(a++ + "*");
             
          } 

          c2=k-a+2;
            for(int j=1;j<=(n+1)-i;j++)
            {
                if(j<=n-i)
               System.out.print(c2++ +"*");
               else
               {
                System.out.print(c2++);
               }
            }
           
          
          System.out.println();
            
    }

  
    
  }  
}
