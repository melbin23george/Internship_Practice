import java.util.Scanner;
class Firstandlastdigit{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    int lastdigit=n%10;
    
    while(n>10){
      
      n=n/10;
      
    }
    int firstdigit=n;
    System.out.println("firstdigit "+firstdigit);
    System.out.println("lastdigit "+lastdigit);
  }
}