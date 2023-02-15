//You are designing a program for a coffee shop that needs to keep track of the inventory of coffee beans they have in stock.
//The program needs to allow the user to input the amount of coffee beans they have and then display the current inventory.

import java.util.*;
 class Usecase1{
   public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
     int beanstock=500;
   System.out.println("Bean in stock : "+beanstock);
     System.out.println("enter the amount of cofee beans user has: ");
      int user_stock=sc.nextInt();
     int total_stock=beanstock+user_stock;
     System.out.println("current coffe bean in stock : " +total_stock);
     
     
   }

 }
