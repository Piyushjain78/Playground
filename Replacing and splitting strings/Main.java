import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      int len=sc.nextInt();
      String s3[]=s2.split(" ");
      for(int i=0;i<s3.length;i++)
        System.out.println(s3[i]);
    }
}