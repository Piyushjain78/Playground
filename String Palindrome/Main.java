import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.next(); 
      String s1="";
      for(int i=s.length()-1;i>=0;i--)
      {
        s1=s1.concat(String.valueOf(s.charAt(i)));
      }
      if(s.equals(s1))
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}