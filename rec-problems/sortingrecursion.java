public class sortingrecursion
{
    public static void main(String[] args) 
    {
        int[] arr={1,2,4};
       boolean k=print(arr,0);
        System.out.println( k);

    }
        public static boolean print(int arr[], int i)
        {

             if(arr[i]==arr.length-1)
             {
                return true;
             }
            
        
             return arr[i]<arr[i+1] && print(arr,i+1);
}
}