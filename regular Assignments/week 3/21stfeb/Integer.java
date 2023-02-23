//write a Java program to print all integers that are divisible by 5 upto 100

import java.util.Scanner;
class Integer{
  public static void main(String args[]){
    int i=0;
    while(i<=100)
    {
      if(i%5==0)
        System.out.println(i);
      i=i+1;
    }
    System.out.println("exit");
  }
}


//int i=10;
//while(i<=100)
//{
  //if(i%5==0)
//syso(i)
//i+1'
//}
//syso("exit")