import java.util.Date;
import java.util.Random;

public class TimeTest2 {
    public static void main(String[] args) {
        Random r = new Random();
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));

        System.out.println(d1);
        System.out.println(d2);

        long t1 = d1.getTime();
        long t2 = d2.getTime();

        if (t1 < t2) {
            System.out.println(d1 + " is before " + d2);
        } else if (t1 > t2) {
            System.out.println(d1 + " is after " + d2);
        }
    }
    
}
