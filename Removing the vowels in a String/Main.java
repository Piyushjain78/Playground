import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here]
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char[] c=s.toCharArray();
    for(int i=0;i<c.length;i++)
    {
      if(c[i]=='a' ||c[i]=='e' ||c[i]=='i' ||c[i]=='o' ||c[i]=='u')
      {
         c[i]='@';
      }    
    }
    
    for(int i=0;i<c.length;i++)
    {
      if(c[i]!='@')
      {
        System.out.print(c[i]);
      }
    }
  }
}