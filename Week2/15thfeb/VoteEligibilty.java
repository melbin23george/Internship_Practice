import java.util.Scanner;
class VoteEligibilty{
  public static void main(String args[]){
    int age;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the ur age :");
    age=sc.nextInt();
    if(age>=18){
      System.out.println("You are Eligible for voting");
    }
    else
      System.out.println("Sorry!! you are not eligible");
    }
  }
