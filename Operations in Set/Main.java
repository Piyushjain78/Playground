import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String s=String.valueOf(br.readLine());
      String arr[]=s.split(",");
      LinkedHashSet hs=new LinkedHashSet();
      for(int i=0;i<arr.length;i++)
        hs.add(arr[i]);
      System.out.println(hs);
      String s1=String.valueOf(br.readLine());
      hs.remove(s1);
      System.out.println("Enter the value to be deleted: "+s1);
      System.out.println(hs);
      String s2=String.valueOf(br.readLine());
      System.out.println("Enter the value to be added: "+s2);
      hs.add(s2);
      System.out.println(hs);
    }
}