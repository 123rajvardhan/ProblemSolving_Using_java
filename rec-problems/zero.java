public class zero 
{ 
   public static void main(String[] args)
    {
     int n=102045;
     System.out.println(zeros(n,0));
   }
   public static int zeros(int n,int c)
   {
      if(n==0)
      {
        return c;
      }
      
       if(n%10==0)
       {
          
          return zeros(n/10, c+1);
       }
       return zeros(n/10,c);
   }   
}
