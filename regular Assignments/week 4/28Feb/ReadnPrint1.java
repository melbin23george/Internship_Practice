import java.util.Scanner;
class ReadnPrint1{
  static void create(int n,int a[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the array values : ");
    
    for(int i=0;i<=n;i++){
      a[i]=sc.nextInt();
    }
  }
  static void display(int a[]){
     for(int i=0;i<=5;i++){
   System.out.println(a[i]);
     }
    
      
    }
  
  public static void main(String args[]){
    int a[]=new int[10];
    
    create(5,a);
    display(a);
  }
  
}
