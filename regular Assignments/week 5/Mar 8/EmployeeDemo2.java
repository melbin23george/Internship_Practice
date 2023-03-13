import java.util.Scanner;
class Employe{
  int eid;
  String name;
  double salary;
  Employe(int id,String n,String sal){
    eid=id;
    name=n;
    salary=sal;
  }
  void grossSalary(double hra,double da){
    double totalSalary=hra+da+salary;
    System.out.println(totalSalary);
  }
  void dispaly(){
    System.out.println(eid+" "+name+" "+salary);
  }
}
public class EmployeeDemo2{
  public static void main(String args[]){
    System.out.println("enter employee information");
    Scanner sc=new Scanner(System.in);
    Employe emp[]=new Employe[5];
    for(int i=0;i<5;i++){
      System.out.println("enter employee "+(i+1)+ " details");
      System.out.println("enter id");
      int id=sc.nextInt();
      System.out.println("enter name");
      String name=sc.next();
      System.out.println("enter salary");
      double salary=sc.nextDouble();
      emp[i]=new Employe(id,name,salary);
    }
    System.out.println("********Employee Information*********");
    for(int i=0;i<5;i++){
      emp[i].display();
      System.out.println("enter hra and Da Details");
      emp[i].grossSalary(sc.nextDouble(), sc.nextDouble());
      }
  }
}