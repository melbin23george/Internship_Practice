import java.util.*;
class BankAccount{
  double balance=100000;
  float intrest_rate=10.00f;
}
class SavingsAccount extends BankAccount{
  Scanner sc = new Scanner(System.in);
  double min_balance=500;
    void withdraw(){
      while(true){
      System.out.println("enter the amount");
      double amount= sc.nextDouble();

      if(balance1>=min_balance){
           System.out.println("the amount balance is " +balance);
      }else{
        System.out.println("add more money");
      }
    }
  }
}
public class bankdemo{
  public static void main(String args[]){
    SavingsAccount sa = new SavingsAccount();
    sa.withdraw();
    
  }
}