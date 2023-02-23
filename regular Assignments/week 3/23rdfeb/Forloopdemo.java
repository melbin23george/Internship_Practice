import java.util.*;
class Forloopdemo{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    for(int i=1;i<=5;i++){
      for(int j=1;j<=5;j++){
        System.out.println(i+" "+j);
      }
    }
  }
}