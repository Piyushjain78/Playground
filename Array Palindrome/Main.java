import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      
      int count=n-1;
      int flag=0;
      for(int i=0;i<=n/2;i++)
      {
         if(arr[i] == arr[count])
         {
            flag=0;
         }
        else
        {
           flag=1;
           break;
        }
        count--;
      }
      if(flag==0)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}