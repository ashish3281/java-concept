
import java.util.ArrayList;
import java.util.Iterator;
public class iteratorExample {
    public static void main(String args[]){
        ArrayList<String> cars=new ArrayList<String>();
  cars.add("volvo");
  cars.add("BNW");
  cars.add("Swift");
  cars.add("Mazda");
  Iterator<String> it=cars.iterator();
  System.out.println(it.next());
    }
}

//looping through a collection
// while(it.hasNext()){
//     System.out.println(it.next());
// }
