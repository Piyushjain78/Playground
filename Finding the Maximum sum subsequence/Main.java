import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    
    int sum=0;
    int flag=0;
    for(int i=0;i<n;i++)
	    {
	      if(i==n-1)
	      {
	        //System.out.println(arr[i]);
            sum=sum+arr[i];
            if(sum>=flag)
               flag=sum;
            sum=0;
	        break;
	      }
	      
	      if(arr[i]<arr[i+1])
	      {
	        //System.out.print(arr[i]+" ");
            sum=sum+arr[i];
	      }
	      else
	      {
	        //System.out.println(arr[i]);
             sum=sum+arr[i];
             if(sum>=flag)
               flag=sum;
             sum=0;
	      }
	    }
    System.out.println(flag);
  }
}