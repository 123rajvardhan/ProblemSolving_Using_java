import java.util.Arrays;
import java.util.Scanner;
public class multiarr 
{ 
  public static void main(String[] args) 
  {
    Scanner s=new Scanner(System.in);
    int a[][]=new int[2][3];
    System.out.println(a.length);
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a[i].length;j++)
        {
            a[i][j]=s.nextInt();
        }
    }
    for(int i=0;i<a.length;i++)
    {
        System.out.print(Arrays.toString(a));
        System.out.println();
  }  
  s.close();
}
}