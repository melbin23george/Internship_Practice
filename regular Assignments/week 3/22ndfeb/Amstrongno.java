import java.util.*;
class Amstrongno{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    int rem,result=0;
    int orgno=n;
    while(n!=0){
      rem=n%10;
      result=result+(int)Math.pow(rem,3);
      n=n/10;
    }
    if(orgno==result){
      System.out.println("Amstrong number");
    }
    else
      System.out.println("not an Amstrongno");
  }
}