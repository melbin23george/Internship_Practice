import java.util.Scanner;
class Evenarraydemo{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    System.out.println("enter the value");
    //read data
    for(int i=0;i<5;i++){
      arr[i]=sc.nextInt();
    }
    //display data
    System.out.println("--------array elements------");
    for(int i=0;i<5;i++){
      if(arr[i]%2==0){
      System.out.println("arr["+ i +"]="+arr[i]);
      }
      else
        System.out.println("no even array");
      
    }
    
  }
}