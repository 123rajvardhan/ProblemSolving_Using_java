public class reverse 
{
   public static void main(String[] args) 
   {
       int n=121;
       System.out.println(helper(n));     
       System.out.println(palin(n));
   }
    static int helper(int n)
    {
    
        int digits=(int)(Math.log10(n))+1;
        return revers(n, digits);
              
    }

   static boolean palin(int n)
   {
        return n== helper(n);
        
   }

   public static int revers(int n,int arg)
   {
    if(n==0)
    {
        return 0;
    }
    else 
    {
        return (n%10)*(int)Math.pow(10,arg-1)+revers(n/10, arg-1);
    }
   }
   
}