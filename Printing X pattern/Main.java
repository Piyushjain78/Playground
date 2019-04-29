import java.util.Scanner;
public class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=1;
      int m=n/2+1;
      for(int i=1;i<=m;i++)
      {
        for(int k=1;k<i;k++)
        {
          System.out.print(" ");
        }
        
         for(int j=m;j>=i;j--)
         {
            if(j==i || j==m)
             System.out.print("*"+" ");
            else
             System.out.print("  ");
         }
        //count=count+2;
        System.out.println(" ");
      }
      
       for(int i=2;i<=m;i++)
      {
        for(int k=m;k>i;k--)
        {
          System.out.print(" ");
        }
        
         for(int j=1;j<=i;j++)
         {
             if(i==1)
             System.out.print(" ");
            if((j==i && i!=1) || j==1)
             System.out.print("*"+" ");
            else
             System.out.print("  ");
            
         }
        //count=count+2;
        System.out.println(" ");
      }
	}
}
