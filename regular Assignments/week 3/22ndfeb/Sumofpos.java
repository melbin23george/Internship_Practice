import java.util.Scanner;
class Sumofpos{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int digit,num,sum=0;
    num=sc.nextInt();
    while(num>0)
      {
        digit=num%10;
        sum=sum+digit;
        num=num/10;
      }
    System.out.println("sum of digits "+sum);
  
    
  }
}