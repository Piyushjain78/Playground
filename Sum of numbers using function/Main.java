import java.util.Scanner;
class Main{
  public static int sum(int i,int s)
  {
     i=i+s;
     return i;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int s=0;
      for(int i=1;i<=n;i++)
      {
        s=sum(i,s);
      }
      System.out.println(s);
	}
}