import java.util.Calendar;

public class Test5JDK7 {
   public static void main(String[] args) {
    Calendar c = Calendar.getInstance();
    c.set(2000, 2, 1);//calendar中0是一月，1是二月，2是三月...
    c.add(Calendar.DAY_OF_MONTH, -1);
    int day = c.get(Calendar.DAY_OF_MONTH);
    System.out.println(day);
   } 
}
