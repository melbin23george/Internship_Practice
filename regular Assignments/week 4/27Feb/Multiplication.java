import java.util.Scanner;
class Multiplication{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a1[][]=new int[3][3];
    int product[][]=new int[3][3];
    System.out.println("enter the values for a1 :");
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        a1[i][j]=sc.nextInt();
      }
      System.out.println();
    }
    //displaying a1
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        System.out.print(a1[i][j]+ " ");
      }
      System.out.println();
    }
     int a2[][]=new int[3][3];
    System.out.println("enter the values for a2 :");
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        a2[i][j]=sc.nextInt();
      }
      System.out.println();
    }
    //displaying a1
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        System.out.print(a2[i][j]+ " ");
      }
      System.out.println();
    }
    System.out.println("Multiplication of Matrices");
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        product[i][j]=a1[i][j]*a2[i][j];
        System.out.print(product[i][j]+" ");
      }
      System.out.println();
    }
    }
  }

    
  
    
    
    
  
