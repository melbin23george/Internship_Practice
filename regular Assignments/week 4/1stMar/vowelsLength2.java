import java.util.*;
class vowelsLength2{
  static void checkSubString(String str1,String subString ){
    
    if(str1.contains(subString)){
    if(subString.contains("@")){
      System.out.println("yes it contains @"+subString.indexof("@gmail",1));
    }
    else
      System.out.println("not contains @");
    }
  
  else{
    System.out.println("invalid");
  }
  
  public static void main(String args[]){
    // Scanner sc=new Scanner(System.in);
    // System.out.println("enter string1");
    // String str1=sc.nextLine();
    // System.out.println("enter string2");
    // String subString=sc.nextLine();
    
    checkSubString("melbin@gmail.com","@gmail");
  }
}