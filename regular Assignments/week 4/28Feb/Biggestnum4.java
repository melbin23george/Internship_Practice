//biggest number among two number
import java.util.Scanner;
class Biggestnum4{
  static  int maxNumber(){
    int a,b;
    a=10;b=20;
    if(a>b){
      return a;
    }
    else
     return b;
  }

  public static void main(String args[]){
  int max=Biggestnum4.maxNumber();
    System.out.println(max);
  }
}