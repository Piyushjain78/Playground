import java.util.Scanner;
public class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=i;j++)
           {
             if(i==1)
               System.out.print("*");
             else
             {
              if(count==2 || count==3 || count==6)
              {
                 if(j%2==0)
                 {
                   System.out.print("*");
                
                 }
                 else
                   System.out.print("#");
                 
              }
              else
              {
                if(j%2==0)
                 {
                   System.out.print("#");
                 }
                else
                   System.out.print("*");
                
              }
             }
           }
          count=count+1;
          System.out.println(" ");
        }
      
    }
}