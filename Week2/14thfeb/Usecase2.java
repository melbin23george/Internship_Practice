import java.util.Scanner;
class Usecase2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int room_rate=850;
    System.out.println("The rate of the room is "+room_rate);
    System.out.println("Please enter the number of day u wish to stay :");
    int stay=sc.nextInt();
    int total_amt=room_rate*stay;
    System.out.println("total cost: "+total_amt);
  }
}