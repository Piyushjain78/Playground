import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
      // type your code here
     Scanner sc=new Scanner(System.in);
     String s=sc.next();
     if(s.equals("12"))
       System.out.println("12");
     else
       System.out.println("Input Mismatch Exception occurred");
   }
}