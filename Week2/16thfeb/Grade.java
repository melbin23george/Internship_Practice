import java.util.Scanner;
class Grade{
  public static void main(String args[] ){
    double phy,chem,math,bio,comp,per;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marks of five subject");
    System.out.println("Physics");
    phy=sc.nextDouble();
    System.out.println("Chemistry");
    chem=sc.nextDouble();
    System.out.println("Maths");
    math=sc.nextDouble();
    System.out.println("Biology");
    bio=sc.nextDouble();
    System.out.println("Computer Science");
    comp=sc.nextDouble();
    per=((phy+chem+math+bio+comp)/500)*100;
    System.out.println("Your percentage is "+per);
    if(per>=90){
      System.out.println("Your is GRADE A");
    }
    else if((per>=80) && (per<90)  ){
      System.out.println("Your is GRADE B");
    }
    else if((per>=70) && (per<80)){
      System.out.println("Your is GRADE C");
    }
    else if((per>=60) && (per<70)){
      System.out.println("Your is GRADE D");
      
    }
    else if((per>=40) && (per<60)){
      System.out.println("your is GRADE E");
    }
    else
      System.out.println("Opps....FAILL");

      }
}