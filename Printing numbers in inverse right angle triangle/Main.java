import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=n;
      for(int i=1;i<=n;i++)
      {
        for(int j=n;j>=i;j--)
        {
           System.out.print("");
           System.out.print(count);
           count--;
        }
        System.out.println(" ");
        count=n-i;
      }
	}
}