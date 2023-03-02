class StringDemo1{
  static void waysTocreate(){
    //1st way
    char a[]={'a','e','i','o','u'};
    String str=new String(a);

    //2nd way
    String str1=new String("Melbin");

    //3rd

    String str2="Melbin";
    System.out.println(str);
    System.out.println(str1);
    System.out.println(str2);
    
  }
  public static void main(String args[]){
    waysTocreate();
    
  }
}