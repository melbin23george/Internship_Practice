import java.util.Scanner;
class YesorNo{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of row");
    int n=sc.nextInt();
    int a[][]=new int[n][n];
    System.out.println("enter element array");
    int count=0;
    //reading
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        a[i][j]=sc.nextInt();
      }
      System.out.println();
    }
    //displaying
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(a[i][j]>10 || a[i][j]!=20){
          
          count++;
          break;
        }
      }
}
    if(count==0){
      System.out.println("yes");
    }
    else
      System.out.println("no");
    }
      
          
      }
    
      
    