import java.util.*;
class Positivenumbers{
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the n value");
      int arr[]=new int[10];
      for(int i=0;i<5;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println("the positive numbers are");
      for(int i=0; i<5;i++){
      if(arr[i]>0){
        System.out.println(arr[i]);
        }
      }
  }
}