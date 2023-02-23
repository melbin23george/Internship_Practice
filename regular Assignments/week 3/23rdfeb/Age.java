import java.util.*;
class Age{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    boolean valid=true;
    do{
      System.out.println("enter the age");
      int age=sc.nextInt();
      if(age>0){
        System.out.println("valid age");
        valid=false;
      }
      else{
        System.out.println("Invalid age ..enter again");
      }
    }
     while(valid);
  }
}
