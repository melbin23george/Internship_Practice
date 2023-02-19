//calculator
//+,-,*,%,/


import java.util.Scanner;
class SwitchDemo2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num1,num2;
    double result=0;
    char operator;
    System.out.println("Enter num1");
    num1=sc.nextInt();
    System.out.println("Enter num2");
    num2=sc.nextInt();
    System.out.println("Select your choice from  +, -, *, /, %");
      operator=sc.next().charAt(0);
    switch(operator){
      case'+':
        result=num1+num2;
        break;
      case'-':
        result=num1-num2;
        break;
      case'*':
        result=num1*num2;
        break;
      case'/':
        result=num1+num2;
        break;
      case'%':
        result=num1%num2;
        break;
      default:
        System.out.println("Invalid input");
        
    }
    System.out.println(result);
  }
}