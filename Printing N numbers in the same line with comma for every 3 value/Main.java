import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=1;
    for(int i=1;i<=n;i++)
    {
      if(count==4)
      {System.out.print(",");
        count=0;
        i=i-1;
      }
      else
        System.out.print(i);
        count=count+1;
    }
  }
}