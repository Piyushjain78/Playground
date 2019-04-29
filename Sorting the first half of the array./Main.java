import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr,0,(arr.length/2));
    for(int i=0;i<n;i++)
     System.out.print(arr[i]+" ");
  }
}