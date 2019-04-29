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
    
   
    for(int i = 0; i <r; i++){
      int count=0;
      for(int j = 0; j <c-i; j++){
        System.out.print(matrix[count][j+i] + " ");
        count++;
      }
      //System.out.println();
    }
  }
}