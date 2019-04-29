import java.util.Scanner;
class Main{
  public static int greater(int n,int n1,int n2)
  {
    int ans=0;
    if(n>n1 && n>n2)
      ans=n;
        if(n1>n && n1>n2)
      ans=n1;
        if(n2>n1 && n2>n)
      ans=n2;
    return ans;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int ans=greater(n,n1,n2);
      System.out.println(ans);
	}
}