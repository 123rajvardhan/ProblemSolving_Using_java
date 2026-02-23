import java.util.Scanner;
public class sumandproduct 
{
  public static void main(String[] args) 
  {
    Scanner s=new Scanner(System.in);
    int[]a=new int[5];
    for(int i=0;i<a.length;i++)
    {
        a[i]=s.nextInt();
    }
    int sum=0;
    int product=1;
    for(int i=0;i<a.length;i++)
    {
       sum=sum+a[i];
       product=product*a[i];
    }
    System.out.println(sum);
    System.out.println(product);
    s.close();
}
}