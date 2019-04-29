import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc=new Scanner(System.in);
    int temp=sc.nextInt();
    int i=3;
    int a,b;
    while(i>0)
    {
      a=temp%10;
      b=temp/10;
      temp=b;
      System.out.print(a);
      i--;
    }
  }
}