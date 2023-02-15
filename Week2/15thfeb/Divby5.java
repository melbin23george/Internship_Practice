//WAP to check whether a number is divisible by 5 and 11 or not.

import java.util.Scanner;
class Divby5{
  public static void main(String args[]){
    float num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    num=sc.nextFloat();
    if(num%5==0){
      System.out.println("number is divisible by 5");
        }
        else{
      System.out.println("not divisible by 5");
        }
    }
  }
