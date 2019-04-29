import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc=new Scanner(System.in);
      int base=sc.nextInt();
      int exp=sc.nextInt();
      int count=1;
      int temp=base;
      while(count<exp)
      {
       base=base*temp;
       count++;
      }
      
      System.out.println(base);
    }
}