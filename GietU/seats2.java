import java.util.*;

class seats2 {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);

        // Taking inputs
        int l1 = s.nextInt();
        int l2 = s.nextInt();
        int l3 = s.nextInt();
        int n = s.nextInt();
        int count = 0;

       
        if (l1>=n) {
            count++;
        }
        if (n > l2) { 
            count++;
        }
        if (n > l3) { 
            count++;
        }

        // Output the count
        System.out.println(count);
        
        s.close();
    }
}
