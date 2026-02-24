public  class I
{

    public static void main(String[] args) 
    {
        
    }

}

class Stack
{
    int arr[] =new int[6];

    int i=0;

    void push(int x )
    {
        arr[i++]=x;
    }

    int peek()
    {
         int top=arr[i-1];
         return  top;
    }

    int pop()
    {
        int ele =arr[i-1];
        arr[i-1]=0;
        i--;
        return ele;
    }
    int size()
    {
        return  i;
    }

    boolean isEmpty()
    {
         if(size()==0)
         {
            return  true;
         }
         else{
            return  false;
         }
    }
    boolean isFull()
    {
         if(size() > arr.length)
         {
            return true;
         }
         return false;

        }
}

