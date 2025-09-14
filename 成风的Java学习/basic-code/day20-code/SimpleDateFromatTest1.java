import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFromatTest1 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2000-11-11");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy日MM月dd日");
        String result = sdf1.format(date);
        System.out.println(result);

    }
    
}
