



public class CrclQueue 
{
    public static void main(String[] args) 
    {
        Ip i=new Ip();
        i.add(2);
        i.add(2);
      i.add(2);
      i.add(2);
      i.add(2);
    }
    
    
    public static class Ip{

        int f=-1;
        int r=-1;
 
         int a[]=new int[10];

         int size=0;

         public void add(int x) throws Exception
         {
              if(size==a.length)
              {
                   throw new Exception("Queue is full");
              }
              else if(size==0)
              {
                f=r=0;
                a[0]=x;
              }
              else if(size<a.length-1)
              {
                  a[++r]=x;
                  size++;
              }
              else if(size==a.length-1)
              {
                  r=0;
                  a[0]=x;
              }
              size++;
         }

         int remov() throws Exception  
         {
             
            if(size==0)         
            {
                 throw new Exception("Queue is full");
            }
           
            else if(f==a.length-1)
            {
                int val=a[f];

                f=0;
                return val;
            }
            else
            {
                 int val=a[f];
                 f++;
                 return val;
         }

    }
}
}