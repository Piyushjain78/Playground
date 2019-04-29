import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static BufferedReader br;
    public static LinkedList ld;
    public static void main(String a[])throws IOException
    {
      //type your code here
      //sc=new Scanner(System.in);
      br = new BufferedReader(new InputStreamReader(System.in));
      ld=new LinkedList();
      while(true)
      {
        System.out.println("Choose any one:");
        System.out.println("1.Insert");
        System.out.println("2.delete");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        int n=Integer.parseInt(br.readLine());
        if(n==4)
           break;
        switch(n)
        {
          case 1: Insert();
                  break; 
          case 2: Delete();
                  break;
          case 3: Display();
                  break;
        }
      } 
    }
        public static void Insert() throws IOException
        {
            String s=String.valueOf(br.readLine());
            Object arr[]=s.split(",");
            for(int i=0;i<arr.length;i++)
              ld.add(arr[i]);          
        }
        
        public static void Delete() throws IOException
        {
           int p=Integer.parseInt(br.readLine());
           ld.remove(p);
           System.out.println("Enter the index value to be deleted:"+p);
        }
        
        public static void Display()
        {
           System.out.println(ld);
        }
}