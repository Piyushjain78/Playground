//import required packages here
import java.util.*;
class Item
{
  private int price;
  //create various method to return attribute value(s)
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
}

class Bill
{
  //implement your logic to calculate total price
  public void total(String s,int p,int a)
  {
       System.out.println("Total Price is : "+(p*a));
  }
}
class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int p=sc.nextInt();
    int a=sc.nextInt();
    obj.total(s,p,a);
    //write the logic here
  }
}