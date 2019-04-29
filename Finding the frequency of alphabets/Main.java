import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.next().toLowerCase();
      //System.out.println(s);
      char[] c=s.toCharArray();
      for(int i=0;i<c.length;i++)
      {
          int count=1;
        for(int j=i+1;j<c.length;j++)
        {
           if(c[i]==c[j])
           {
              c[j]='$';
              count++;
           }
        }
        if(c[i]!='$')
        System.out.print(String.valueOf(c[i])+count+" ");
      }
    }
}