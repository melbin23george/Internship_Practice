import java.util.*;
class vowelsLength{
  static void checkSubString(String str1,String subString ){
    
    if(str1.contains(subString)){
      for(int i=0;i<subString.length()-1;i++){
        if(subString.charAt(i)=='a'||subString.charAt(i)=='e'||subString.charAt(i)=='i'||subString.charAt(i)=='o'||subString.charAt(i)=='u'){
          System.out.println(subString.charAt(i));
          
        }
      }
      
    }
    else
      System.out.println("invalid");
    }
  
  public static void main(String args[]){
    // Scanner sc=new Scanner(System.in);
    // System.out.println("enter string1");
    // String str1=sc.nextLine();
    // System.out.println("enter string2");
    // String subString=sc.nextLine();
    
    checkSubString("welcome to bitlabs","bitlabs");
  }
}