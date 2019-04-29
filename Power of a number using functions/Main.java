import java.util.Scanner;
import java.lang.Math;
class Main{
   public static double power(int n,int n1)
   {
     return (Math.pow(n,n1));
   }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n1=sc.nextInt();
      int ans=(int)power(n,n1);
      System.out.println(ans);
	}
}