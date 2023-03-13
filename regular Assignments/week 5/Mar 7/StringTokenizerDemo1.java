import java.util.StringTokenizer;
class StringTokenizerDemo1{
  public static void main(String args[]){
    StringTokenizer s=new StringTokenizer("welcome to bitlabs");
    while(s.hasMoreTokens()){
      System.out.println(s.nextToken());
    }
  }
  
}