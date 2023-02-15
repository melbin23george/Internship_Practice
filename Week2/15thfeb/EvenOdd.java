//WAP to check whether a number is even or odd.
import java.util.Scanner;
class EvenOdd{
  public static void main(String args[]){
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    num=sc.nextInt();
    if(num%2==0){
      System.out.println("the number is even");
    }
    else
      System.out.println("the number is odd");
  }
}