//WAP to find maximum between three numbers.

import java.util.Scanner;
class MaxthreeNumber{
  public static void main(String args[]){
    int firstnumber,secondnumber,thirdnumber;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    firstnumber=sc.nextInt();
    System.out.println("Enter the second number");
    secondnumber=sc.nextInt();
    System.out.println("Enter the third number");
    thirdnumber=sc.nextInt();
    if((firstnumber>secondnumber)&&(firstnumber>thirdnumber))
      System.out.println("firstnumber is the maximum number");
    else if((secondnumber>firstnumber )&& (secondnumber>thirdnumber))
      System.out.println("second number is the maximum number");
    else
    System.out.println("third number is the maximum nuber");
    }
   
    
  }
