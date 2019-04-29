import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine().toLowerCase();
      char[] c=s.toCharArray();
      for(char i='a';i<='z';i++)
      { int flag=0;
         for(int j=0;j<c.length;j++)
         {
            if(i==c[j])
            {
             
              flag=1;
               //eak;
            }
         }
       if(flag==0)
         System.out.print(i+" ");
         
      }
    }
}