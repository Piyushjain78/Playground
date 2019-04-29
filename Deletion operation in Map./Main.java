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
      TreeMap hs=new TreeMap();
      for(int i=1;i<=s;i++)
        hs.put(br.readLine(),br.readLine());
      
      System.out.println("Enter the number of values to be inserted in map:"+hs.size());
      System.out.println(hs);
      Object s1=String.valueOf(br.readLine());
      hs.remove(s1);
      System.out.println("Enter the index to be removed:"+s1);
      System.out.println(hs);
      Object s2=String.valueOf(br.readLine());
      Object s3=String.valueOf(br.readLine());
      hs.put(s2,s3);
      System.out.println("Enter the index to insert:"+s2);
      System.out.println("Enter the value to be inserted:"+s3);
      System.out.println(hs);
    }
}