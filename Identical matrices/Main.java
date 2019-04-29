import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int matrix[][] = new int[r][c];
    int matrix1[][] = new int[r][c];
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        matrix[i][j] = in.nextInt();
      }
    }
    
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        matrix1[i][j] = in.nextInt();
      }
    }
    
   //int count1=r-1;
    int flag=1;
    for(int i = 0; i <r; i++){
      //int count=0;
      for(int j = 0; j <c; j++){

        if(matrix[i][j]!=matrix1[i][j])
          flag=0;
      }
      //System.out.println();
    }
    
    if(flag==1)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}