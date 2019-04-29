import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String s1=sc.next();
    char c[]=s.toCharArray();
    char c1[]=s1.toCharArray();
    
    for(int i=0;i<c1.length;i++)
    {
      for(int j=0;j<c.length;j++)
      {
         if(c1[i]==c[j])
         {
           c[j]='@';
         }
      }
    }
    for(int j=0;j<c.length;j++)
    {
       if(c[j]!='@')
         System.out.print(c[j]);
    }
  }
}