

public class program2 
{
  public static void main(String[] args) 
  {
      print(1); 
  }
  public static void print(int n)
  {
      if(n==10)
      {
         System.out.println(5);
        return;
      }
      System.out.println(n);
      print(n+1); //this is called tail recursion
  }   
}
//!recursion-> function calls itself
//? why recursion -> it helps us in solving bigger/comples problems in simple way.
