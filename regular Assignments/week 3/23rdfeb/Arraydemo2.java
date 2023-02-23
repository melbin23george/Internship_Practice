import java.util.Scanner;
class Arraydemo2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    double arr[]=new double[5];
    System.out.println("enter the value");
    //read data
    for(int i=0;i<5;i++){
      arr[i]=sc.nextDouble();
    }
    //display data
    System.out.println("--------array elements------");
    for(int i=0;i<5;i++){
      System.out.println("arr["+ i +"]="+arr[i]);
    }
    
  }
}