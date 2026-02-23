import java.util.Scanner;
//import java.io.*;
public class cumulative 
{
     public static void main(String[] args) 
    {
      Scanner s= new Scanner(System.in);
       int i;
       int a[]=new int[5];
       int b[]=new int[5];
       int sum=0;
       System.out.println("enter an array");
       for(i=0;i<a.length;i++)
       {
         a[i]=s.nextInt();
       }
       for( i=0;i<a.length;i++)
       {
         sum=sum+a[i];
         b[i]=sum;
       }
       System.out.println("cummulative array:");
       
       for( i=0;i<b.length;i++)
       {  
         System.out.println(b[i]);
       }

    }
}