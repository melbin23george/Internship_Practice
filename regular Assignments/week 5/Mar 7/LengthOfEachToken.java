import java.util.StringTokenizer;
class LengthOfEachToken{
  public static void main(String args[]){
    StringTokenizer s=new StringTokenizer("welcome to  bitlabs");
    
    while(s.hasMoreTokens()){
      String str=s.nextToken();
      System.out.println(str.length());
     
      }
     
      }
  }
