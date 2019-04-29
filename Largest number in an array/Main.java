import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int len=sc.nextInt();
      int arr[]=new int[len];
      int sum=0;
      for(int i=0;i<len;i++)
      {
        arr[i]=sc.nextInt();
      }
      
      for(int i=0;i<len;i++)
      {
         if(arr[i]>sum)
           sum=arr[i];
      }
      System.out.println(sum);
    }
}