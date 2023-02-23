import java.util.Scanner;
class Countevenarray{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
      int a[]=new int[5],sum=0;
    System.out.println("enter the array values");
    for(int i=0;i<5;i++){
     a[i]=sc.nextInt();
    }
    int count=0;
    for(int i = 0;i<5;i++){
      if(a[i]%2==0){
        count++;
      }
    }
    System.out.println("count of even = : "+count);
  }
}