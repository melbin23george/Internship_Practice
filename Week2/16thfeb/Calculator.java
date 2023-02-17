import java.util.Scanner;
class Calculator{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    char operator;
    System.out.println("----Calculator---");
    System.out.println("Enter num 1");
    double a=sc.nextDouble();
    System.out.println("Enter operator(+,-,*,/) :");
    operator=sc.next().charAt(0);
    System.out.println("Enter num 2");
    double b=sc.nextDouble();
    if (operator=='+'){
      double c=a+b;
      System.out.println(a+""+operator+"" +b+" = "+c);
    }
    else if (operator=='-'){
      double c=a-b;
      System.out.println(a+""+operator+"" +b+" = "+c);
    }
    else if (operator=='*'){
      double c=a*b;
      System.out.println(a+""+operator+"" +b+" = " +c);
    }
    else if (operator=='/'){
      double c=a/b;
      System.out.println(a+""+operator+"" +b+" = " +c);
    }
  }
}