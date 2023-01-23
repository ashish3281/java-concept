//multiple interface
interface first{
    public void method();
}
interface second{
    public void method1();
}
class demo implements first,second{
    public void method(){
        System.out.println("Some text...");
    }
    public void method1(){
        System.out.println("some other text...");
    }
}
public class InterfaceExample1 {
    public static void main(String args[]){
        demo obj=new demo();
        obj.method();
        obj.method1();
    }
}
