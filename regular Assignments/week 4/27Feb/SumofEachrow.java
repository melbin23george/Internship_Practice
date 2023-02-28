//import java.util.Scanner;
class SumofEachrow{
  public static void main(String args[]){
    int a[][]={{1,4,3},{5,5,6},{5,5,5}};
    int sum=0;
    int i,j;
    int count=0;
    for( i=0;i<3;i++){
      sum=0;
      for( j=0;j<3;j++){
        sum=sum+a[i][j];
        //System.out.print(a[i][j]+" ");  
      }
      System.out.println(sum);
    }
    //System.out.println(sum);
    //System.out.println(a[2][2]);;
  }
}