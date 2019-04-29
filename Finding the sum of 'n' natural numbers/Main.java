
import java.util.*; 

import java.lang.*; 

  

class Main
{ 

  

    // Returns sum of first  

    // n natural numbers 

    public static int recurSum(int n) 

    { 

        if (n <= 1) 

            return n; 

        return n + recurSum(n - 1); 

    } 

      

    // Driver code 

    public static void main(String args[]) 

    { 
      Scanner sc=new Scanner(System.in);

        int n = sc.nextInt(); 

        System.out.println(recurSum(n)); 

    } 
}