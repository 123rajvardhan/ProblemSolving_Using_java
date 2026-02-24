import java.util.*;
class exponent
{
   public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  exponent(a,b);

   
}

public static void exponent(int a,int b)
{
   int max =0;
   int pow=0;
   int count=0;

   for(int i=a;i<=b;i++)
   {
      while(i%2==0)
      {
         pow=i%2;
         if(pow==0)
         {
            count++;
         }
         i=i/2;
      }
      if(count>max)
      {
        max=count;
      }
   }
System.out.println(max);

}
}