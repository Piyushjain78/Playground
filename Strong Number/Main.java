import java.util.Scanner;
class Main{
public static void main(String args[])
{
//Try out your code here
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int n1=n;
  int sum=0;
  int leng=String.valueOf(n).length();
  for(int i=0;i<leng;i++)
  {
     int sum1=1;
     int temp=n%10;
     for(int j=1;j<=temp;j++)
     {
        sum1=sum1*j;
     }
     sum=sum+sum1;
     int rem=n/10;
     n=rem;
  }

  if(sum==n1)
   System.out.println("Yes");
  else
    System.out.println("No");
}
}