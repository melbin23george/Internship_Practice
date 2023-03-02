import java.util.*;
class Comparing{
  static void compareStr(String str1,String str2){
    if(str1.equals(str2)){
      System.out.println("String are equals");
    }
      else{
      System.out.println("not equal");
      }
    }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter the 1st string");
    String str1=sc.nextLine();
       System.out.println("enter the 2nd string");
    String str2=sc.nextLine();

    compareStr(str1, str2);
    
    
    
  } 
  }
