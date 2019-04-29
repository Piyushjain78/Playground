import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
public class Main {
    // type your code here
  public static void main(String a[]){
      // type your code here
      Scanner sc=new Scanner(System.in);
      String us=sc.nextLine();
      String em=sc.nextLine();
      String pa=sc.nextLine();
      char c[]=us.toCharArray();
     // for(int i=0;i<c.length;i++)
      //{
         Pattern p=Pattern.compile("[a-zA-Z0-9_-]");
         Matcher m=p.matcher(us);
         if(m.find())
           System.out.println("Is "+us+" a valid user name? "+m.find());
         else
           System.out.println("Is "+us+" a valid user name? "+"false");
         
         Pattern p1=Pattern.compile("[^a-z0-9_@.]");
         Matcher m1=p1.matcher(em);
         if(m1.find())
           System.out.println("Is "+em+" a valid email address? "+m1.find());
         else
           System.out.println("Is "+em+" a valid email address? "+"true");
    
         Pattern p2=Pattern.compile("[^a-zA-Z0-9@#$%]");
         Matcher m2=p2.matcher(pa);
         if(m2.find())
           System.out.println("Is "+pa+" a valid password? "+m2.find());
         else
           System.out.println("Is "+pa+" a valid password? "+"true"); 
      //}
    }
}