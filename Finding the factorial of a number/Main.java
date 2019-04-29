import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int nn=fact(n);
    System.out.println(nn);
  }
  
  public static int fact(int n)
  {
    if(n==0)
      return 1;
    else
    {
      //System.out.println(n*fact(n-1));
     return n*fact(n-1);
    }
  }
}