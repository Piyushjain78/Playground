import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
       // type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String s1=sc.nextLine();
      Pattern p=Pattern.compile(s);
      Matcher m=p.matcher(s1);
      int count=1;
      int flag=0;
      while(m.find())
      { 
         System.out.println("found: "+count+" : "+m.start()+" - "+m.end());
         count++;
         flag=1;
      }
      if(flag==0)
        System.out.println("The given word is not present in the string");
      if(flag==1)
        System.out.println(--count);
    }
}