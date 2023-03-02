import java.util.*;
  class Splitting2{
    static void wordSplit(String str){
      String words[]=str.split("o");
      for(int i=0;i<words.length;i++){
        System.out.println(words[i]);
      }
    }
    public static void main(String args[]){
      wordSplit("hoi hiow aore you");
    }
  }