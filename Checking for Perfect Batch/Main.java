import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
     fun(arr,n);  
  }
  
  public static void fun(int arr[],int n)
  {
    int count=0;
    int temp=0;
    int sum=0;
    int flag=1;
    int arr1[]=new int[(n/3)];
    int l=0;
    for(int i=0;i<n;i++)
    {
      if(count<=2)
      {
          sum=sum+arr[i];
          if(count==2)
          {
              arr1[l++]=sum;
          }
           count++;
      }
      else
      {
          count=1;
          sum=arr[i];
      }
    }
    
    for(int i=0;i<arr1.length;i++)
    {
        if(i<arr1.length-1)
        {
          if(arr1[i]==arr1[i+1])
          {
              flag=1;
          }
          else
          {
              flag=0;
              break;
          }
        }
        else
          break;
    }
    
    if(flag==1)
    System.out.println("Perfect Batch");
    if(flag==0)
    System.out.println("Not a Perfect Batch");
    
  }
}