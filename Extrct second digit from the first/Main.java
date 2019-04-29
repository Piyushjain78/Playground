import java.util.Scanner;
import java.lang.Math;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int l=(String.valueOf(n)).length();
      int second;
      second=(n/(int)Math.pow(10,(l-2)));
      int sec=second%10;
      System.out.println(sec);
	}
}