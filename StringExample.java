public class StringExample {
    public static void main(String args[]){
    String str="hello World";
    System.out.println(str.length());
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
    String str1="hello how are you";
    System.out.println(str1.indexOf("are"));

    //string concatenation
    String firstname="ashish";
    String lastname="goyal";
    System.out.println(firstname+" "+lastname);
    System.out.println(firstname.concat(lastname));

    int x=2;
    int y=5;
    int z=x+y;
    System.out.println(z);
    String s="20";
    String t="30";
    String u=s+t;
    System.out.println(u);
    String r=x+s;
    System.out.println(r);

    }
}
