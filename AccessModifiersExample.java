public class AccessModifiersExample{
    private String fname="ashish";
    private int  age=21;
    public static void main(String args[]){
        AccessModifiersExample obj=new AccessModifiersExample();
        System.out.println(obj.fname);
        System.out.println(obj.age);
    }
}