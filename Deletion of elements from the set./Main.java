import java.io.*;
import java.util.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     // type your code here
             // type your code here
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String s=String.valueOf(br.readLine());
      String arr[]=s.split(",");
      TreeSet hs=new TreeSet();
      for(int i=0;i<arr.length;i++)
        hs.add(arr[i]);
      
      System.out.println(hs);
      Arrays.sort(arr);
      int count=0;
      for(int i=arr.length-1;i>=0;i--)
      { 
         hs.remove(arr[i]);
         if(i==2)
           count++;
         if(count>0)
         {
            // System.out.println(hs);
            count--;
         }
         else if(count==0)
           System.out.println(hs);
         if(arr[i].equals("Hello"))
                      System.out.println(hs);

      }
    }
}