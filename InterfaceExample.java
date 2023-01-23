interface animal{
    public  void animalSound();
    public void sleep();
}
class pig implements animal{
    public void animalSound(){
        System.out.println("WEE WEE");
    }
    public void sleep(){
        System.out.println("ZZZZ");
    }
}
public class InterfaceExample {
    public static void main(String args[]){
        pig obj=new pig();
        obj.animalSound();
        obj.sleep();
    }
}
