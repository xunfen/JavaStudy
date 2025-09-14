import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Test4JDK8 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2007, 4, 24);
        LocalDate ld2 = LocalDate.now();

        long days = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println("Days: " + days);
    }
    
}
