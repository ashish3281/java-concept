class Animal {
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
    
}
class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says:wee wee");
    }
}
class dog extends Animal{
    public void animalSound(){
        System.out.println("the dog says: bow wow");
    }
}
public class PolymorphismExample{
    public static void main(String args[]){
        Animal obj=new Animal();
        Animal obj1=new Pig();
        Animal obj2=new dog();
        obj.animalSound();
        obj1.animalSound();
        obj2.animalSound();
    }
}
