//BasicSalary

import java.util.Scanner;
class BasicSalary{
  public static void main(String args[]){
    double bSalary;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your Basic Salary");
    bSalary=sc.nextDouble();
    if(bSalary<=10000){
      double da=bSalary*0.8;
      double hra=bSalary*0.2;
      double grossSalary=bSalary+da+hra;
      System.out.println("Gross Salary is"+grossSalary);
    }
    else if(bSalary<=20000){
      double da=bSalary*0.9;
      double hra=bSalary*0.25;
      double grossSalary=bSalary+da+hra;
      System.out.println("Gross Salary is "+grossSalary);
    }
    else if(bSalary>20000){
      double da=bSalary*0.95;
      double hra=bSalary*0.3;
      double grossSalary=bSalary+da+hra;
      System.out.println("Gross Salary is"+grossSalary);
    }
    else
      System.out.println("Inappropriate Input");
    
  }
}