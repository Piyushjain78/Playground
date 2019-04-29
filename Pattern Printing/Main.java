import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner sc=new Scanner(System.in);
      int r=sc.nextInt();
      int c=sc.nextInt();
      int count1=r;
      for(int i=1;i<=r;i++)
      {
        int count=0;
        int count2=r;
         for(int j=1;j<i;j++)
         {
               System.out.print(count2);
               count2--;
               count++;
         }
         for(int j=count;j<c;j++)
         {
               System.out.print(count1);
         }
        count1--;
        System.out.println("");
      }
    }
}