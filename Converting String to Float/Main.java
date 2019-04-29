import java.util.*;
public class Main
{
public static void main(String args[])
	  {

	    Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1="";
        //System.out.print(s);
        //String[] arr=new String[2];
        String[] data =s.split("\\.");
        //System.out.print(data[1]);
        if(data.length==2)
        {
	    char[] c=data[0].toCharArray();
	    int sum=0;
	    for(int i=0;i<c.length;i++)
	    {

	       sum=sum*10+c[i]-'0';
	    }
	    
	    char[] c1=data[1].toCharArray();
	    int sum1=0;
	    for(int i=0;i<c1.length;i++)
	    {

	       sum1=sum1*10+c1[i]-'0';
	    }
	    
	    System.out.print(sum+"."+sum1);
        }
        else
        {
        char[] c2=data[0].toCharArray();
	    int sum2=0;
	    for(int i=0;i<c2.length;i++)
	    {

	       sum2=sum2*10+c2[i]-'0';
	    } 
	    System.out.print(sum2);
	    
        }
	    
	  }
}