import java.util.*;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
         arr[i]=sc.nextInt();
      }
      int f=sc.nextInt();
      Arrays.sort(arr);
      System.out.println(arr[n-f]);
    }   
}