
import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int p=(String.valueOf(n)).length();
      int sum=0;
      int rem,last;
      int l=0;
      while(l<p)
      {
        last=n%10;
        sum=sum+last;
        rem=n/10;
        n=rem;
        l=l+1;
      }
      System.out.println(sum);
	}
}