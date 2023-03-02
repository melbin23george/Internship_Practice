class StringDemo2{
  static void waysTocreate(){
    //1st way
    char a[]={'a','e','i','o','u'};
    String str=new String(a);

    //2nd way
    String str1=new String("Melbin");

    //3rd

    String str2="Melbin";
    String str3="George";
    String str4=str2.concat("George");
      
    System.out.println(str);
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str4);
    
  }
  public static void main(String args[]){
    waysTocreate();
    
  }
}