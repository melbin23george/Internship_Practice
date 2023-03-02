import java.util.*;
class Reversewords{
  static void reverse(String str){
    String rev="";
    String words[]=str.split(" ");
    for(int i=0i<=a){
      rev=rev+a[i];
    }
    System.out.println(rev);
  }
  public static void main(String args[]){
    reverse("melbin");
  }
}