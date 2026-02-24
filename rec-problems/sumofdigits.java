public class sumofdigits 
{
   public static void main(String[] args) 
   {
      System.out.println(sumofdigit(1022));
   }   
   public static int sumofdigit(int n)
   {
      if(n%10==n)
      {
        return n;
      }

      else
      return sumofdigit(n/10)*(n%10);
   }
}
