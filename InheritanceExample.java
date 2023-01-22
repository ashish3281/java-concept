public class InheritanceExample {
    protected String brand="ford";
    public void honk(){
        System.out.println("Tuut,tuut");

    }
}
class Car extends InheritanceExample{
    private String modelName="Mustang";
    public static void main(String[] args){
        Car obj=new Car();
        obj.honk();
        System.out.println(obj.brand+" "+obj.modelName);
    }
}
