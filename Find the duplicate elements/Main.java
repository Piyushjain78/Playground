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
      LinkedList hs=new LinkedList();
      LinkedList hs1=new LinkedList();
      String arr[]=s.split(",");
      for(int i=0;i<arr.length;i++)
        hs.add(arr[i]);
      
      Collections.sort(hs);
      hs1.addAll(hs);
      System.out.println("Duplicate Entry is:");
      for(int i=0;i<arr.length;i++)
      {
         if(i+1>=arr.length)
           break;
         if(hs.get(i)==hs.get(i+1) || hs.get(i).equals(hs.get(i+1)))
         {
            Object ob=hs.get(i);
            System.out.println(ob);
            hs1.remove(ob);
            i++;
         }
      }  
      System.out.println("TreeSet is : "+hs1);
    }
}