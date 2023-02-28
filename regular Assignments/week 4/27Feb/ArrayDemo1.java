import java.util.Scanner;
class ArrayDemo1{
  public static void main(String args[]){
    int a[][]={{12,45,63},{65,85,56},{52,25,56}};
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        System.out.print(a[i][j]+" ");  
      }
      System.out.println();
    }
    System.out.println(a[2][2]);;
  }
}