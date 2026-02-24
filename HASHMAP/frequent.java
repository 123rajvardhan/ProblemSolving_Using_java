import java.util.HashMap;

public class frequent 
{
   public static void main(String[] args) 
   {
      int arr[]={1,2,4,5,2,3};
 
      int ans=-1;
      int max=0;
      HashMap<Integer,Integer> hm=new HashMap<>();
      for(int i=0;i<arr.length;i++)
      {
        if(hm.containsKey(arr[i]))
        {
            int val=hm.get(arr[i]);
            val+=1;
            hm.put(arr[i], val);
        }
        else
        {
            hm.put(arr[i], 1);
        }
        if(hm.get(arr[i])>max)
        {
            max=hm.get(arr[i]);
            ans=arr[i];
        }

       
      }
      System.out.println(ans);
      
   }  
}
