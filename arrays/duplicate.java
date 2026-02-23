import java.util.Scanner;
public class duplicate 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
     ko   String name="vardhan";
        int k=name.hashCode();
        System.out.println(k);
        s.close();
    }
    static int fib(int k)
    {
        return (int)(Math.pow((1+Math.sqrt(5)/2),k)/Math.sqrt(5));
    }
    // s.close();
}

