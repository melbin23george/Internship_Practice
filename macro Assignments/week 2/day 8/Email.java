import java.util.Scanner;
class Email{
public static void main (String args[]){
Scanner sc= new Scanner (System.in);
  String userinput;
  System.out.println("Please enter username/email");
  userinput = sc.next();
  System.out.println("Verifying");
  if (userinput.equals("User2") || userinput.equals("user@gmail.com"))
      System.out.println("Access Granted");
  else
      System.out.println("Access Denied");
    }
}