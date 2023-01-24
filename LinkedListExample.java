import java.util.LinkedList;
public class LinkedListExample {
     public static void main(String[] args) {
        LinkedList<String>cars=new LinkedList<String>();
        cars.add("volvo");
        cars.add("BNW");
        cars.add("Swift");
        cars.add("Mazda");

        cars.addFirst("Oddi");
        System.out.println(cars);
        cars.addLast("wagnar");
        System.out.println(cars);
    
        System.out.println(cars.removeFirst());
        System.out.println(cars.removeLast());
        
        System.out.println(cars);
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
    }
}
