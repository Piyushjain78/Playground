import java.util.*;
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
    int arr1[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr1[i]=arr[i];
    }
    Arrays.sort(arr1);
    for(int i=0;i<n;i++)
    {
      if(arr1[n-1]==arr[i])
      {
        count=i;
      }
    }
    System.out.println(count);
  }
}