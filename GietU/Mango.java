import java.util.*;

class Mango {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);

        // Taking inputs
        int l1 = s.nextInt();
        int l2 = s.nextInt();
        int l3 = s.nextInt();
       
        if(l3 %l1 ==0 || l3 % l1 ==1 || l3 %l2 ==0 ||l3%l2==1 )
        {
             System.out.println("Yes");
        }
        else
        {
             System.out.println("No");
        }

        // Output the count
        
        
        s.close();
    }
}
