import java.util.*;
class InsertChar{
  static void getCharacter(String str){
    System.out.println(str.charAt(12));
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    System.out.println("enter String");
    sc.nextLine();
    String str1=sc.nextLine();
    System.out.println(str1);
    getCharacter(str1);
  }
}