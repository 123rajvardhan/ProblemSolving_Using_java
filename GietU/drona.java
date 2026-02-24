

import java.util.Scanner;

public class drona 
{
   public static void main(String[] args) 
   {
      Scanner s=new Scanner(System.in);
      int target=s.nextInt();

       int i=0,turns=0;
       while(i<=target)
       {
          i+=s.nextInt();
          if(i>=target)
          {
             turns++;
             break;
          }
          turns++;
          i++;
       }
       System.out.println(turns);
   } 
}
