import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0;
      for(int i=1;;i++)
      {
        if(i%2==1)
        {
          System.out.println(i);
          count=count+1;
        }
        if(count==n)
          break;
      }
	}
}