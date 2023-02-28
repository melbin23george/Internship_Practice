import java.util.Scanner;
class Sum{
  public static void main(String args[]){
    int a[][]={{1,4,3},{5,5,6},{5,5,5}};
    int sum=0;
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        sum=sum+a[i][j];
        System.out.print(a[i][j]+" ");  
      }
      System.out.println();
    }
    System.out.println(sum);
    //System.out.println(a[2][2]);;
  }
}