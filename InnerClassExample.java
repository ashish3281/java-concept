class outerclass{
    int x=10;

class Innerclass{
    int y=5;
}
}
public class InnerClassExample {
 public static void main(String args[]){
    outerclass obj=new outerclass();
    outerclass.Innerclass obj1=obj.new Innerclass();
    System.out.println(obj1.y+obj.x);
 }   
}
