import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateExample1 {
    public static void main(String args[]){
  LocalDateTime Today=LocalDateTime.now();
  System.out.println("Before formatting:"+Today);
  DateTimeFormatter obj=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
  String formattedDate=Today.format(obj);
  System.out.println("after formatting:"+formattedDate);
    }
}
