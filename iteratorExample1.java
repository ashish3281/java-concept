import java.util.ArrayList;
import java.util.Iterator;
public class iteratorExample1 {
    public static void main(String args[]){
        ArrayList<Integer> number=new ArrayList<Integer>();
number.add(1);
number.add(6);
number.add(3);
number.add(7);
number.add(54);
  Iterator<Integer> it=number.iterator();
  while(it.hasNext()){
    Integer i=it.next();
    if(i<10){
        it.remove();
    }
  }
  System.out.println(number);
    }
}
