import java.util.Scanner;
class ArrayDemo2{
  public static void main(String args[]){
    int a[][]={{1,2,3},{2,3,6},{4,2,5}};
    int count=0;
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        if(a[i][j]%2==0){
        System.out.print(a[i][j]+" ");
        count++;
        }
      }
      System.out.println();
    }
   // System.out.println(a[2][2]);
    System.out.println(count);
  }
}