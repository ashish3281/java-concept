import java.util.ArrayList;
import java.util.function.Consumer;
public class lambdaExpression1 {
    public static void main(String args[]){
   ArrayList<Integer>number=new ArrayList<Integer>();
   number.add(4);
   number.add(5);
   number.add(7);
   number.add(8);
   Consumer<Integer>method=(n)->{System.out.println(n);};
   number.forEach(method);
    }
}
