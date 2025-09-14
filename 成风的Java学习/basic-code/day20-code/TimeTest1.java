import java.util.Date;

public class TimeTest1 {
    public static void main(String[] args) {
        Date d1 = new Date(0L);
        long time = d1.getTime();
        time = time + 1000L * 60 * 60 * 24 * 365;
        d1.setTime(time);
        System.out.println(d1);
    }
    
}
