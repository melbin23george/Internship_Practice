//WAP to check whether a number is negative, positive or zero.
import java.util.Scanner;
class PosNegZero{
  public static void main(String args[]){
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    num=sc.nextInt();
    if (num>0) {
      System.out.println("the number is positive number");
}
    else if(num<0){
      System.out.println("the number is negative number");
    }
    else
      System.out.println("the number is zero");
  }
  
  
}