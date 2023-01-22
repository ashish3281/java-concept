public class AccessModifiersExample2{
    protected String fname="ashish";
    protected int  age=21;
    public static void main(String args[]){
        AccessModifiersExample2 obj=new AccessModifiersExample2();
        System.out.println(obj.fname);
        System.out.println(obj.age);
    }
}