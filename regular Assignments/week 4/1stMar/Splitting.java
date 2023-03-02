import java.util.*;
  class Splitting{
    static void wordSplit(String str){
      String words[]=str.split(" ");
      for(int i=0;i<words.length;i++){
        System.out.println(words[i]);
      }
    }
    public static void main(String args[]){
      wordSplit("hi hiw are you");
    }
  }