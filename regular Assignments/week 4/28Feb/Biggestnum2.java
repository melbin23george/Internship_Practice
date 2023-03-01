//biggest number among two number
import java.util.Scanner;
class Biggestnum2{
  static  int maxNumber(int a,int b){
    if(a>b){
      return a;
    }
    else
     return b;
  }

  public static void main(String args[]){
   int maxNumber=Biggestnum2.maxNumber(6, 5);
    System.out.println(maxNumber);
  }
}