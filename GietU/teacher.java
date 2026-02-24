import java.util.*;
public class teacher
{
     public static void main(String[] args) 
     {
        Scanner s=new Scanner(System.in);

        float i=3,score=0;
        while(i>0)
        {
            int a=s.nextInt();
            if(a<0)
            {
                score-=1;
                break;
            }
            if(a%2==1)
            {
                score+=1;
            }
            else if(a%2==0)
            {
                score+=0.5;
            }
            i--;
        }
        System.out.println(score);
     }
}
