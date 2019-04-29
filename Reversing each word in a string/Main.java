import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String[] sp=s.split(" ");
    for(int i=0;i<sp.length;i++)
    {
       char c[]=sp[i].toCharArray();
       int index=c.length-1;
       for(int j=0;j<c.length/2;j++)
       {
          char temp=c[index];
          c[index]=c[j];
          c[j]=temp;
          index--;
       }
       System.out.print(c);
       System.out.print(" ");
    }
  }
}