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
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        matrix[i][j] = in.nextInt();
      }
    }
    
   int count1=r-1;
    for(int i = 0; i <r; i++){
      int count=0;
      for(int j = 0; j <c; j++){
        System.out.print(matrix[count][count1] + " ");
        count++;
      }
      count1--;
      System.out.println();
    }
  }
}