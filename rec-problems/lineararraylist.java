import java.util.ArrayList;

public class lineararraylist 
{
    static ArrayList<Integer> list1=new ArrayList<>();
   public static void main(String[] args) 
   {
       int[] arr={1,2,5,2,3,8,12};
       int target=2;
     ArrayList<Integer> ans  =print(arr,target,0,new ArrayList<>());
       System.out.println(ans);

   } 
   public static ArrayList<Integer> print(int[] arr,int target,int i,ArrayList<Integer> list)
   {
      
       if(i==arr.length)
       {
         
         return list;
       }
       if(arr[i]==target)
       {
        list.add(i);
       }
       
       return print(arr, target, i+1, list);
        
   }

}
