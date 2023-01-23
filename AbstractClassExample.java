abstract class animal{
    public abstract void animalSound();
    public void sleep(){
        System.out.println("ZZZZ");
    }
}
class pig extends animal{
    public void animalSound(){
        System.out.println("WEE WEE");
    }
}
public class AbstractClassExample {
    public static void main(String args[]){
        pig obj=new pig();
        obj.animalSound();
        obj.sleep();
    }
}
