import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int s=Integer.parseInt(br.readLine());
      LinkedHashMap hs=new LinkedHashMap();
      for(int i=1;i<=s;i++)
        hs.put(br.readLine(),br.readLine());
      
      System.out.println("Enter the number of values to be inserted in map:"+hs.size());
      System.out.println(hs);
      String s1=String.valueOf(br.readLine());
      hs.remove(s1);
      System.out.println("Enter the index to be removed:"+s1);
      System.out.println(hs);
      System.out.println("Size of map is : "+hs.size());

    }
}