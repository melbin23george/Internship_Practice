import java.util.Scanner;
class divisibleby5{
  public static void main(String args[]){
    int a[][]={{1,4,3},{5,5,6},{5,5,5}};
    
    for(int i=0;i<3;i++){
      int count=0;
      for(int j=0;j<3;j++){
        
        if(a[i][j]%5==0){
        //System.out.print(a[i][j]+" ");
          count++;
        }
        
      }
      System.out.println(count);
    }
    //System.out.println(sum);
    //System.out.println(a[2][2]);;
  }
}