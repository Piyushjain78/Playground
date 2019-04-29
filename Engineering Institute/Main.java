//import required packages
import java.util.*;
class Faculty
{
  int n;
  public void salary()
  {
    //write your Faculty class statements
    
    System.out.println("Base Salary: "+(n));
  }
}
class CSE extends Faculty
{
  public void salary()
  {
    //write your CSE class statements
    super.salary();
    System.out.println("CSE Faculty: "+(super.n+3000));
  }
}
class IT extends CSE
{
  public void salary()
  {
    //write your IT class statements
    super.salary();
    System.out.println("IT Faculty: "+(super.n+5000));
  }
}
class ECE extends IT
{
  public void salary()
  {
    //write your ECE class statements
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    super.salary();
    System.out.println("ECE Faculty: "+(n+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    ECE obj = new ECE();
    obj.salary();
    //implement your required concept here
  }
}