//integer
import java.util.Scanner;
class MethodsDemo2{
  static int sum(){//with return type without parameters
    int a,b;
    a=10;b=20;
    return a+b;
  }

  public static void main(String args[]){
    int sum=MethodsDemo2.sum();
    System.out.println(sum);
  }
}