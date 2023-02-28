import java.util.Scanner;
class ArrayDemo4{
  public static void main(String args[]){
    int a[][]=new int[3][2];
    int count=0;
    Scanner sc=new Scanner(System.in);
    //reading
    for(int i=0;i<3;i++){
      for(int j=0;j<2;j++){
        a[i][j]=sc.nextInt();
      }
    }
    //displaying
    for(int i=0;i<3;i++){
      for(int j=0;j<2;j++)
      
          if(a[i][j]==2){
        System.out.print(a[i][j]+" ");  
            count++;
      }
    }
      System.out.println();
    }
    //System.out.println(a[2][2]);;
  
}