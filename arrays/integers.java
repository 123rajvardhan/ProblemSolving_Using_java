import java.util.Scanner;
public class integers 
{
   public static void main(String[] args) 
   {
      Scanner s=new Scanner(System.in);
        int arr[]=new int[20];
        for(int i=1;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        positive(arr);
        negative(arr);
        odd(arr);
        even(arr);
        s.close();
   }
   public static void positive(int arr[])
   {
    System.out.println("positive numbers");
    for(int i=1;i<arr.length;i++)
    {
        if(arr[i]>0)
        {
            System.out.println(i);
        }
    }
   }
   public static void negative(int arr[])
   {
    System.out.println("negative numbers are:");
    for(int i=1;i<arr.length;i++)
    {
        if(arr[i]<0)
        {
            System.out.println(i);
        }
    }
   }
   public static void odd(int arr[])
   {
    System.out.println("odd numbers are:");
    for(int i=1;i<arr.length;i++)
    {
        if(arr[i]%2!=0)
        {
            System.out.println(i);
        }
    }
   }
   public static void even(int arr[])
   {
    System.out.println("even numbers are:");
    for(int i=1;i<arr.length;i++)
    {
        if(arr[i]%2==0)
        {
            System.out.println("even number:"+i);
        }
    }
   }          
}
