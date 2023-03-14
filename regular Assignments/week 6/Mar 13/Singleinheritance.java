class Person{
  String name;
  String address;
  int age;
  void display(){
    System.out.println(name+" "+address+" "+age+" ");
  }
}
class Employee extends Person{
  String empDpt;
  void show(){
    System.out.println(empDpt+" ");
  }  
} 
public class Singleinheritance{
  public static void main(String args[]){
  Employee emp=new Employee();
  emp.name="Melbin";
  emp.address="KA";
  emp.age=23;
  emp.empDpt="IT";
  emp.display();
  emp.show();
  }   


}