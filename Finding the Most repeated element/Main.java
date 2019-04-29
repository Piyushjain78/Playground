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
      
      int temp=0;
      int sum=0;
     for(int i=0;i<n;i++)
     {
       int count=0;
       for(int j=i+1;j<n;j++)
       {
         if(arr[i]==arr[j])
         {
           count++;
           if(count>=sum)
           { 
             temp=arr[i];
           }
         }
         
       }
       sum=count;
       i=i+count;
     }
      if(sum==0)
        System.out.println(arr[0]);
      else
        System.out.println(temp);
  }
}