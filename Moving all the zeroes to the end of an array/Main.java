import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      int arr1[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      int c=0;
      for(int i=0;i<n;i++)
      {
        if(arr[i]!=0)
        {arr1[c]=arr[i];
         c++;
        }
          
      }
      for(int i=0;i<n;i++)
        System.out.print(arr1[i]+" ");
    }
}