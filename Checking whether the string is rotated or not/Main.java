import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      String s1=sc.next();
      String s2=s+s;
      int flag=0;
       //System.out.print(s2);
      for(int i=0;i<s2.length();i++)
      {
        if((i+s.length())<=s2.length())
        {
        if(s2.substring(i,s.length()+i).equals(s1))
           {
              flag=1;
           }
        }
       }
       if(flag==1)
           System.out.print("Yes");
       else
           System.out.print("No");
    }
}