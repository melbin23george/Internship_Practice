//write an program to find the sum of the digits of a positive integer using while loop

import java.util.Scanner;
class SumInteger{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num,Digit,Sum=0;
    System.out.println("Enter the number");
    num = sc.nextInt();
    while (num > 0){
      Digit = num%10;
      Sum = Sum + Digit;
      num = num/10;
    }
    System.out.println("The sum of Digits is :" +Sum);
  }
}