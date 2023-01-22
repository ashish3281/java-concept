public class ConstructorExample {
    int roll;
    String name;
    ConstructorExample(){
        System.out.println("default constructor");
    }
    ConstructorExample(int r,String n){
     roll=r;
     name=n;
     System.out.println(roll);
     System.out.println(name);
    }
    public static void main(String args[]){
        ConstructorExample obj=new ConstructorExample();
        ConstructorExample obj1=new ConstructorExample(206010,"ashish");
    }
}
