import java.util.*;
class Contains{
  static void checkSubString(String str1,String subString ){
    if(str1.contains(subString)){
      System.out.println("valid");
    }
    else
      System.out.println("invalid");
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter string1");
    String str1=sc.nextLine();
    System.out.println("enter string2");
    String subString=sc.nextLine();
    checkSubString(str1,subString);
  }
}