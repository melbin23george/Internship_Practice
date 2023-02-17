//Employee Salary Calculator: Create an application that takes an employee's salary and calculates their annual salary, tax and net salary. Use conditional statements to determine the tax bracket and calculate the tax accordingly.

import java.util.Scanner;

class EmployeeSalaryCalculator {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the employee salary");
    double salary,annualSalary,tax=0,netSalary;
     salary=sc.nextDouble();
    annualSalary=salary*12;
    if(annualSalary<300000){
      System.out.println("there is no tax");
    }
    else if((annualSalary>=300000)&&(annualSalary<600000)){
      System.out.println("You have to 5% of the total income");
      // tax=annualSalary*0.05;
      System.out.println("Your tax is "+tax);
    }
    else if((annualSalary>=600000)&&(annualSalary<900000)){
      System.out.println("You have to 10% of the total income");
       tax=annualSalary*0.10;
      //System.out.println("Your tax is "+tax);
    }
    else if((annualSalary>=900000)&&(annualSalary<1200000)){
      System.out.println("You have to 15% of the total income");
       tax=annualSalary*0.15;
     // System.out.println("Your tax is "+tax);
    }
    else if((annualSalary>=1200000)&&(annualSalary<1500000)){
      System.out.println("You have to 20% of the total income");
      tax=annualSalary*0.20;
      //System.out.println("Your tax is "+tax);
    }
    else if((annualSalary>1500000)){
      System.out.println("You have to 25% of the total income");
       tax=annualSalary*0.25;
      //System.out.println("Your tax is "+tax);
    }
    else{
    System.out.println("invalid input");
    }
    System.out.println("Your tax is "+tax);
    netSalary=annualSalary-tax;
    System.out.println("netsalary is "+netSalary);
    
      
    
      }
}