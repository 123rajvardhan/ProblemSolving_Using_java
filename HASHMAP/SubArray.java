import java.util.HashMap;

public class SubArray 
{
    public static void main(String[] args) 
     {
        int arr[]={1,21,44,55,42,5};
        int arr1[]={21,45,56};
        
        HashMap<Integer,Integer> mp =new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            mp.put(i,arr[i]);
        }
        for(int i:arr1)
        {
        if(mp.containsValue(i))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
        
        
    }
}
