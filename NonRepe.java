
public class NonRepe 
{
    public static void main(String[] args) 
    {
         String str="apple";
        // str= str.toLowerCase().replace(" ", "");

         int freq[]=new int[26];

         for(int i=0;i<str.length();i++)
         {
             char ch= str.charAt(i);
             freq[ch-'a']++;
         }
        
         for(int i=0;i<str.length();i++)
         {
                char ch= str.charAt(i);
               

                int value = freq[ch-'a'];

                System.out.println( ch + ":" + value);


         }

    
    }       
}
