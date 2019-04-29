import java.util.Scanner;
import java.lang.Math;
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
     int temp=n%10;
     sum=sum+(int)Math.pow(temp,leng);
     int rem=n/10;
     n=rem;
  }
 
  if(sum==n1)
   System.out.println("Armstrong Number");
  else
    System.out.println("Not a Armstrong Number");
}
}