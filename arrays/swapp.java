import java.util.Arrays;

public class swapp 
{
   public static void main(String[] args) 
   {
      int[] arr={1,2,3,4,23};
      swap(arr,1,4);
      System.out.println(Arrays.toString(arr));
   } 
   static void swap(int[] arr,int i,int j)
   {
       int tmp=arr[i];
       arr[i]=arr[j];
       arr[j]=tmp;
   }
}
