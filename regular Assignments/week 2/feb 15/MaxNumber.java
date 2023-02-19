//WAP to find maximum between two numbers.
import java.util.Scanner;
class MaxNumber{
  public static void main(String args[]){
    int firstnumber,secondnumber;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    firstnumber=sc.nextInt();
    System.out.println("Enter the second number");
    secondnumber=sc.nextInt();
    if(firstnumber>secondnumber)
      System.out.println("firstnumber is the maximum number");
    else
      System.out.println("second number is the maximum number");
    }
   
    
  }
