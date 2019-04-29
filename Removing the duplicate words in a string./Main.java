import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String s1[]=s.split(" ");
    int count=0;
    String t="";
    int flag=1;
    for(int i=0;i<s1.length;i++)
    {
       for(int j=0;j<s1.length;j++)
       {
          if(s1[i].equals(s1[j]) && !s1[i].equals("@") && i!=j)
          {
             s1[j]="@";
             if(count==0)
             {
               t=t+s1[i]+" ";    
             }
             count++;
            flag=0;
            break;
          }
         else
         {
           flag=1; 
         }
       }
         if(flag==1 && !s1[i].equals("@"))
         {
            t=t+s1[i]+" ";
         }
      count=0;
    }
    System.out.println(t);
  }
}