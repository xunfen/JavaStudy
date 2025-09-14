import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Test4JDK7 {
    public static void main(String[] args) throws ParseException  {
        String birthday = "2007年4月24日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(birthday);
        long birthdayTime = date.getTime();
        long todayTime = System.currentTimeMillis();
        long ageTime = todayTime - birthdayTime;
        System.out.println(ageTime / 1000 / 60 / 60 / 24);

    }
    
}
