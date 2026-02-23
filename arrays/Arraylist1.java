import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist1
 {
    public static void main(String[] args)

    {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10);
        for(int i=0 ;i<5;i++)
        {
            list.add(s.nextInt());
        }
        for(int i=0 ;i<5;i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println(list);

    }
}
