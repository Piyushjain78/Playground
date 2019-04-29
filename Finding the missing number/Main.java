import java.util.*;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      
      int count=1;
      Arrays.sort(arr);
      for(int i=0;i<n;i++)
      {
         if(arr[i]!=count)
         {  
           System.out.println(count);
           break;
         } 
          count++;
      }
    }
}