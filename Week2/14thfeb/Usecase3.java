import java.util.*;
class Usecase3{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Students Grade list");
    System.out.println("Enter the grade of sub1");
    int sub1=sc.nextInt();
    System.out.println("Enter the grade of sub2");
    int sub2=sc.nextInt();
    System.out.println("Enter the grade of sub3");
    int sub3=sc.nextInt();
    int avg=(sub1+sub2+sub3)/2;
    System.out.println("total grade of student : "+avg);
    
  } 
}