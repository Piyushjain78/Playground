import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Integer arr[]=new Integer[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr,0,(arr.length/2));
    for(int i=n/2;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(arr[j]>arr[i])
        {
           int temp=arr[j];
           arr[j]=arr[i];
           arr[i]=temp;
        }
      }
    }
    for(int i=0;i<n;i++)
     System.out.print(arr[i]+" ");
  }
}