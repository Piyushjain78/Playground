import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      //type your code here
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String s=String.valueOf(br.readLine());
      String arr[]=s.split(",");
      LinkedHashSet hs=new LinkedHashSet();
      for(int i=0;i<arr.length;i++)
        hs.add(arr[i]);
      System.out.println(hs);
    }
}