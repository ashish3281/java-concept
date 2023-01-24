import java.util.ArrayList;
import java.util.Collections;
public class ArrayListExample {
    public static void main(String args[]){
  ArrayList<String> cars=new ArrayList<String>();
  cars.add("volvo");
  cars.add("BNW");
  cars.add("Swift");
  cars.add("Mazda");
  System.out.println(cars);

  System.out.println(cars.get(0));
  cars.set(0,"opel");
  System.out.println(cars);
  

  cars.remove(0);
  System.out.println(cars);

  //cars.clear();

  System.out.println(cars.size());

  for(int i=0;i<cars.size();i++){
    System.out.println(i);
  }

  for(String i:cars){
    System.out.println(i);
  }
   Collections.sort(cars);
   System.out.println(cars);
   
    }
}
