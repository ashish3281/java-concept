import java.util.HashMap;
public class HashMapExample {
    public static void main(String args[]){
    HashMap<String,String>city=new HashMap<String,String>();
    city.put("England","Londan");
    city.put("Germany","Berlin");
    city.put("Norway","oslo");
    System.out.println(city);

    System.out.println(city.get("England"));

    //city.clear();

    city.remove("England");
    System.out.println(city);
    System.out.println(city.size());

    for(String i:city.keySet()){
        System.out.println(i);
    }

    for(String i:city.values()){
        System.out.println(i);
    }
    }
}
