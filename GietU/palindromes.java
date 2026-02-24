import java.util.Scanner;

public class palindromes 
{
   public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
 
  for(int i=a;i<=b;i++)
  {
     if(ispalindrome(i))
     {
        System.out.println(i);
     }
  }   
  sc.close();
} 
public static boolean ispalindrome(int n)
{
     int temp=n;
     int rev=0;
     while(temp>0)
     {
        int rem=temp%10;
        rev=rev*10+rem;
        temp/=10;
     }
      if(rev==n)
     {
        return true;
     }
     else
     {
        return false;
     }
}

}
