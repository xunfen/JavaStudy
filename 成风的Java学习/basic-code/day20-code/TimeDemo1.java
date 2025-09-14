import java.util.Date;

public class TimeDemo1 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);

        Date d2 = new Date(0L);
        System.out.println(d2);

        d2.setTime(1000L);
        System.out.println(d2);

        long time = d2.getTime();
        System.out.println(time);
    }
    
}
