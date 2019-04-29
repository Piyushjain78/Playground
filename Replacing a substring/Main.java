import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String s1=sc.next();
      String s2=sc.next();
      for(int i=0;i<s.length();i++)
      {
        if((i+s1.length())<=s.length())
        {
        if(s.substring(i,s1.length()+i).equals(s1))
           {
              s=s.replace(s.substring(i,s1.length()+i),s2);
           }
        }
       }
           System.out.print(s);
    }
}