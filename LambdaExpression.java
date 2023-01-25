import java.util.ArrayList;
public class LambdaExpression {
    public static void main(String args[]){
  ArrayList<String> cars=new ArrayList<String>();
  cars.add("volvo");
  cars.add("BNW");
  cars.add("Swift");
  cars.add("Mazda");
  cars.forEach((n) -> { System.out.println(n); } );
    }
    
}
