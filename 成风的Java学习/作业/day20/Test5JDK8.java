import java.time.LocalDate;

public class Test5JDK8 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2000, 3, 1);
        LocalDate ld2 = ld.minusDays(1);
        System.out.println(ld2.getDayOfMonth());
        System.out.println(ld2.isLeapYear());//直接用方法判断是否为闰年
    }
    
}
