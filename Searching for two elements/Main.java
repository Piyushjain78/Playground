import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int len=sc.nextInt();
      int arr[]=new int[len];
      int flag=0;
      for(int i=0;i<len;i++)
      {
        arr[i]=sc.nextInt();
      }
      int n=sc.nextInt();
      int n1=sc.nextInt();
      for(int i=0;i<len;i++)
      {
        if(arr[i]==n || arr[i]==n1)
        {
           System.out.println(i);
           flag=flag+1;
        }
        
      }
          if(flag==1 || flag==0)
          {
           System.out.println("-1");
          }
    }
}