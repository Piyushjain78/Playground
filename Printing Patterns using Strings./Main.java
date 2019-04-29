import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here8
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int len=s.length();
    int count=0;
    for(int i=1;i<=len;i++)
    {
      for(int k=len-1;k>=i;k--)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++)
      {
        if(((len/2)+j-1)>=len)
        {
           System.out.print(s.charAt(count));
           count++;
        }
        else
         System.out.print(s.charAt((len/2)+j-1));
      }
      System.out.println();
      count=0;
    }
  }
}