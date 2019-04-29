import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
     Scanner sc=new Scanner(System.in);
      String s=sc.nextLine(); 
      String s1=sc.next();
      int count=0;
     for(int i=0;i<s.length();i++)
     {
       if(s1.length()+i>s.length())
         break;
       
        String sub=s.substring(i,s1.length()+i);
        if(s1.equals(sub))
          count++;
     }
    System.out.println(count);
  } 
}