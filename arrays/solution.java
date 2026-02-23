import java.util.*;
public class solution 
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  int a=1,b=1,c;
      System.out.println(a);
      System.out.println(b);
	  for(int i=3;i<=n;i++)
	  {
		  c=a+b;
		  a=b;
		  b=c;
          if(n==i)
		 System.out.println(c);
    }
		
	}

}
