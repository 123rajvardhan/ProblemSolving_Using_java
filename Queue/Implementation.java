package Queue;

import java.util.*;

public class Implementation 
{
   public static void main(String[] args) {

    Queue<Integer> q=new LinkedList<>();

    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    System.out.print(q);
    Queue<Integer> l=new LinkedList<>();

    while(!q.isEmpty())
    {
        l.add(q.remove());
    }
    System.out.println(l);
    
   }    
}
