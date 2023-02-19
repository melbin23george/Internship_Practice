//switch demo

//input number(10,0,30,50,60);

//Invalid number

import java.util.Scanner;
class SwitchDemo{
  public static void main(String args[]){
    int number;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your choice ");
    number=sc.nextInt();
    switch(number){
      case 10:
        System.out.println("number is 10");
        break;

      case 20:
        System.out.println("number is 20");
        break;
        
      case 30:
        System.out.println("number is 30");
        break;

      case 50:
        System.out.println("number is 50");
        break;

      case 60:
        System.out.println("number is 60");
        break;

      default:
        System.out.println("Invalid");
    }
  }
}