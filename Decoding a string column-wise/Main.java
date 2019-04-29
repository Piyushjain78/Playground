import java.util.Scanner;
class Main{
  public static void main(String args[]) 
  {
    // Type your code here
     Scanner in = new Scanner(System.in);
     String str = in.nextLine();
     int col = in.nextInt();
    	 char c[]=str.toCharArray();
	     int len=0;    
	     char dc[][]=new char[100][col];
	     int count1=0;
	     char cp=c[0];
	     
	     
//SHIFING CHARACTERS TO LEFT TO REMOVE SPACES
	     
	     
	     for(int i=0;i<c.length;i++)
	     {
	        int count=0;
	        if(c[i]==' ')
	        {
	          for(int j=i+1;j<c.length;j++)
	          {
	            c[j-1]=c[j];
	            count=j;
	          }        
	          c[count]=' ';
	        }
	     }
	     c[0]=cp;
	     String sp=String.valueOf(c);
	     len=sp.trim().length();
	     
// PUT THE 1D CHAR ARRAY VALUE TO 2D CHAR ARRAY SO THAT WE CAN PRINT DECODED STRING COLOUMN WISE
	     
	     
	     int ilength=0;
	     for(int i=0;i<100;i++)
	     {
	       if(count1>=len-1)
	         break;
	       
	       ilength++;
	       int track=col-1;
	       for(int j=0;j<col;j++)
	       {
	           if(i%2==0)
	           {
	              dc[i][j]=c[count1];
	              count1++;           
	            
	           }
	         
	           if(i%2==1)
	           {
                  if(i==1 && track==0 && dc[0][0]=='h')
                   dc[1][0]='X';
                 else
                 {
	              dc[i][track]=c[count1];
	              count1++;
	              track--;
                 }

	           }
	       }           
	     }
	    
//  PRINTING DECODED STRING

	     for(int i=0;i<col;i++)
	     {
	       int ptr=0;
	       for(int j=0;j<ilength;j++)
	       {
	         if(dc[ptr][i]!=' ')
	          System.out.print(dc[ptr++][i]);
             else
               System.out.print("X");
	       }
	     }
  }
}