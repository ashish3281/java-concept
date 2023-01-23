class outerclass{
    int x=10;

static class Innerclass{
    int y=5;
}
}
public class InnerClassExample1 {
 public static void main(String args[]){
    
    outerclass.Innerclass obj1=new outerclass.Innerclass();
    System.out.println(obj1.y);
 }   
}
