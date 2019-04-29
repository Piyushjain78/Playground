import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine(); 
      String[] words=s.split(" ");
      int count=0;
      for(int i=words.length-1;i>=0;i--)
        {
          System.out.print(words[i]+" ");
        }
    }
}