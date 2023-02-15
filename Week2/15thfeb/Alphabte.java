//WAP to check whether a character is alphabet or not.

import java.util.Scanner;
class Alphabte{
  public static void main(String args[]){
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the character");
    ch=sc.next().charAt(0);
    if((ch>='a'&&ch>='b')||(ch>='A'&&ch>='Z'))
      System.out.println("It is character");
    else
      System.out.println("It is not a character");
  }
  
}