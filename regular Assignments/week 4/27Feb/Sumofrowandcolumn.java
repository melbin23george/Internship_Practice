import java.util.Scanner;
class Sumofrowandcolumn{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a1[][]=new int[3][3];
    int sumr[]=new int[3][3];
    int sumc[]=new int[3][3];
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
    System.out.println("Sum of Matrices");
    for(int i=0;i<3;i++){
      //for(int j=0;j<3;j++){
        sumr[i]=a1[i]+a2[i];
        //sumr[i][j]=a1[i][j]+a2[i][j];
        System.out.print(sumr[i]+" ");
        //System.out.print(sumr[0][j]+" ");
      }
    //for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        //sumr[i][j]=a1[i][j]+a2[i][j];
        sumr[j]=a1[j]+a2[j];
        //System.out.print(sumr[i][0]+" ");
        System.out.print(sumr[j]+" ");
      }
      System.out.println();
    }
    }

//}
  

    
  
    
    
    
  
