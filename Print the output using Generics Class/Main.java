import java.util.*;
public class Main<T> 
{ 
  // type your code here
  T a;
  public void sett(T a)
  {
     this.a=a;
  }
  public T get()
  {
     return a;
  }
  public static void main(String[] args) 
     { 
       // type your code here
       Scanner sc=new Scanner(System.in);
       
       Main<Integer> m=new Main<Integer>();
       m.sett(sc.nextInt());
       System.out.println("Integer Value: "+m.get());
       
       Main<String> m1=new Main<String>();
       m1.sett(sc.next());
       System.out.println("String Value: "+m1.get());
       
       Main<Float> m2=new Main<Float>();
       m2.sett(sc.nextFloat());
       System.out.println("Float value: "+m2.get());
     }
 }