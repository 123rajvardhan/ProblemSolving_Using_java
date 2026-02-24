import java.util.Scanner;
public class numbers
{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        print(n);
        s.close();
        
    }
    public static void  print(int n)
    {
          int i=1;
          if(i<=n)
          {
            System.out.println(n);
          }
          print(i+1);
          return ;
    }
}
