import java.util.HashSet;
public class HashSetExample {
    public static void main(String args[]){
        HashSet<String> cars=new HashSet<String>();
        cars.add("volvo");
        cars.add("BNW");
        cars.add("Swift");
        cars.add("Mazda");
        System.out.println(cars);

        System.out.println(cars.contains("Mazda"));
        cars.remove("volvo");
        System.out.println(cars);

        System.out.println(cars.size());

        for(String i:cars){
            System.out.println(i);
        }
        
    }
}
