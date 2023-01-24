import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class DateExample {
    public static void main(String args[]){
        LocalDate obj=LocalDate.now();
        LocalTime obj1=LocalTime.now();
        System.out.println(obj);
        System.out.println(obj1);
        LocalDateTime obj3=LocalDateTime.now();
        System.out.println(obj3);
    }
}
