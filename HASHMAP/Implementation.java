
import java.util.HashMap;
import java.util.Map;

// package HASHMAP;


public class Implementation 
{
    public static void main(String[] args) 
    {
      HashMap<Integer,String> mp=new HashMap<>();
      
      mp.put(1,"vardhan");
      mp.put(2,"van");
      mp.put(3,"var");

      for(Map.Entry<Integer,String> entry: mp.entrySet())
      {
          System.out.println(entry.getKey() + "->" + entry.getValue());
      }
      // if(mp.containsKey(1))
      // {
      //    System.out.println("true");
      // }
      // else
      // {
      //   System.out.println("false");
      // }

      for(Integer key:mp.keySet())
      {
         System.out.print(mp.get(key));
      }
    }
}
