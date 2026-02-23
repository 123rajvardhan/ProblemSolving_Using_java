import java.util.List;
public class copy 
{
  public static void main(String[] args) 
  {
       List<Long> li=List.of(1L,2L,3L);
       
       List<Long> even = li.stream()
                             .filter(i->i%2==0)
                            .toList();
       System.out.println(even);
  }
}
