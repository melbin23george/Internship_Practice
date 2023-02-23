import java.util.*;
class Strongno{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    int fact=1;
    int rem,sum=0;
    int temp=n;
    while(n>0)
      {
        rem=n%10;
        fact=1;
        for(int i=1;i<=rem;i++){
        fact=fact*i;
        }
        
        sum=sum+fact;
        n=n/10;
      }
    
    if(sum==temp)
      System.out.println(temp+" is a strong number");
    else
      System.out.println(temp+" is not a strong number");
  }
}
      