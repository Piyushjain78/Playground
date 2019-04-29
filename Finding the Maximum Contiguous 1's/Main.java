import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
      
      int count=0;
      int count1=0;
      int sum=0;
    for(int i=0;i<n;i++)
    {
       if(arr[i]==1)
       {
         count++;      
       }
      else
      {
         count1=count;
         if(count1>=count && count1>=sum)
           sum=count1;
        
         count=0;
      }
    }     
      System.out.println(sum);
    }
}