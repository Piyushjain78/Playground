import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc=new Scanner(System.in);
      int len=sc.nextInt();
      switch(len)
      {
        case 1: int len1=sc.nextInt();
                System.out.println(len1*len1);
                break;
        case 2: int len2=sc.nextInt()*sc.nextInt();
                System.out.println(2*len2);
                break;  
         case 3: int len3=sc.nextInt()*sc.nextInt();
                System.out.println(len3/2);
                break;  
         case 4: double len4=sc.nextDouble();
                System.out.println(3.14*len4*len4);
                break;  
      }
    }
}