public class factorial
{
   public static void main(String[] args) 
   {
    //   facto(0);
      System.out.println(facto(2));
   }   
   static int facto(int n)
   {
    //  int fact=1;
       if(n==1)
       {
        return 1;
       }
    
       return n+facto(n-1);
   }
}
