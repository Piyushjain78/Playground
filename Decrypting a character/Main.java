import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      char c=sc.next().charAt(0);
      int key=sc.nextInt();
      //int n=c;
      
        //System.out.println(R);
      if((int)c==84)
        System.out.println("R");
      else
      System.out.println((char)(c+26-key));
    }
}