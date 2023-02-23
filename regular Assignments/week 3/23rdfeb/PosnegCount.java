import java.util.*;
class PosnegCount{
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the n value");
      int arr[]=new int[5];
      for(int i=0;i<5;i++){
        arr[i]=sc.nextInt();
      }
      int countp=0,countn=0;
      for(int i=0; i<5;i++){
      if(arr[i]>0){
        countp++;
        }
        else
        countn++;
      }
    System.out.println("Count of positive number is "+countp);
    System.out.println("Count pf negative number is "+countn);
  }
}