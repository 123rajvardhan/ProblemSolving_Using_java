import java.util.Scanner;
public class codedopes1 
{
    public static void main(String[] args) 
    {
    Scanner s=new Scanner(System.in);
      System.out.println("Enter the elements in array:");
      int arr[]=new int[10]; //intialising an array
      for(int i=0;i<arr.length;i++)// taking input
      {
        arr[i]=s.nextInt();
      } 
      System.out.println("Enter the element you want to search");  
      int n=s.nextInt();
      boolean find=false;
      for(int i=0;i<arr.length;i++)
      {
         if(n==arr[i])
         {
            find=true;
            break;
         }
         
      }  
      if(find)
      {
        System.out.println("element is present");
      }
      else{
        System.out.println("element is not 11present");
      }
      s.close();  
    }
    
}
