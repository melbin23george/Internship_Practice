import java.util.*;
class Usecase4{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Book id");
    int book_id=sc.nextInt(); 
    System.out.println("Enter Book Name");
    String bookname=sc.next();
    System.out.println(" Enter Borrower id");
    int id=sc.nextInt();
    System.out.println(" Enter phone number");
    long phone=sc.nextLong();
    System.out.println("Book ID"+book_id);
    System.out.println("Book Name"+bookname);
    System.out.println("Borrower ID:"+id);
    System.out.println("Phone Number: "+phone);
  }
}