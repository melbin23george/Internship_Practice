import java.util.*;
class Palindrom {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter n value");
    int n=sc.nextInt();
    int rev=0;
    int temp=n;
    while(n!=0){
      rev=rev*10+n%10;
      n=n/10;
      
    }
    System.out.println("the reverse number is"+rev);
    if(temp==rev){
      System.out.println("the number is a palindrome");
    }
    else
      System.out.println("nope");
  }
}


    