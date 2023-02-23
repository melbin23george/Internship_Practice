import java.util.Scanner;
class Primeno{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    System.out.println("entr the values");
    //read data
    for(int i=0;i<5;i++){
      arr[i]=sc.nextInt();
      
    }
    System.out.println("the prime no are ");
    //check all array elements
  for(int i=0;i<5;i++){
    int count=0;
    for(int j=1;j<=arr[i];j++){
      if(arr[i]%j==0){
        count++;
      }
    }
    if(count==2){
     System.out.println(arr[i]); 
    }
  }
  }
}
