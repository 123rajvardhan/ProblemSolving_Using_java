// import java.util.Arrays;
import java.util.Scanner;
public class foreachloop 
{
   public static void main(String[] args) 

 {
   Scanner s=new Scanner(System.in);

         int arr[]=new int[5];
      for(int i=1;i<arr.length;i++)
      {
       arr[i]=s.nextInt();
      }
      for(int i:arr)
      {
       System.out.println(i);
      }
      s.close();
   }   
}
