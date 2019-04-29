import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
      //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      //System.out.println(br.readLine());
      Scanner sc=new Scanner(System.in);
      String s1=sc.next();
     // System.out.println(sc.next());
      LinkedList ld=new LinkedList();
      //String arr[]=new String[4];
      String arr[]=s1.split(",");
      for(int i=0;i<arr.length;i++)
      {
         ld.add(arr[i]);
      }
      String s=sc.next();
      System.out.println(ld);
      System.out.println("Size of the linked list: "+ld.size());
      System.out.println("Is LinkedList empty? "+ld.isEmpty());
      System.out.println("Does LinkedList contains "+s+"?");
      System.out.println(ld.contains(s));
      
    }
}