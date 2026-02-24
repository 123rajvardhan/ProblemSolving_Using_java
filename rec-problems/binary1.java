public class binary1
{
    public static void main(String[] args) 
    {
         int arr[]={1,3,3,5};
         int target=3;
         System.out.println(search(arr, target, 0, arr.length-1));
    }
    public static int search(int arr[],int target,int s,int e)
    {
        if(s>e)
        {
            return -1;
        }
        int mid=s+(e-s)/2;
        if(target==arr[mid])
        {
            return mid;
        }
       if(arr[s]<=arr[mid])
       {
        if(target >=s && target<=mid)
        {
             return search(arr, target, s, mid-1);
        }
        else{
            return search(arr, target, mid+1, e);
        }
       }
       if(target>=mid && target<=e)
       {
        return search(arr, target, mid+1, e);
       }
       return search(arr, target, s, mid-1);
    }
}
