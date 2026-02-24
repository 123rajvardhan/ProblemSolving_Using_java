import java.util.*;
class seats
{
 public static void main(String ar[])
{
  Scanner s=new Scanner(System.in);
  int l1=s.nextInt();
  int l2=s.nextInt();
  int l3=s.nextInt();
  if( l1 <l2 && l1<l3)
{
  System.out.println("L1");
}
 else if(l2<l1 && l2<l3)
{
  System.out.println("L2");
}
 else
{
 System.out.println("L3");
}
s.close();
}
}