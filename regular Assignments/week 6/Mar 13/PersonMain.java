//Hybrid
class Person{
  String name;
  int age;
}
class Employee extends Person{
  double sal;
}
class Manager extends Employee{
  int num_reports;
  int hire_employee(){
  return num_reports++;
  }
}
class Engineer extends Manager{
  String specilazation;
  void solve_problem(){
    System.out.println("Problem Solved");
  }
}
public class PersonMain{
  public static void main(String args[]){
   Manager s1=new Manager();
    s1.name="Melbin";
    s1.age=23;
    s1.sal=56000;
    s1.num_reports=5;
    s1.hire_employee();
    System.out.println(s1.num_reports);
  }
}