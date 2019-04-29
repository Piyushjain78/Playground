import java.util.Scanner;
import java.lang.Math;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int l=(String.valueOf(n)).length();
      int last,first;
      last=n%10;
      first=(n/(int)Math.pow(10,(l-1)));
      System.out.println(first+last);
	}
}
