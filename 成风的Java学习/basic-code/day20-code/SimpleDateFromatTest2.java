import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFromatTest2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        String start = "2023年11月11日 0:0:0";
        String end = "2023年11月11日 0:10:0";
        String jia = "2023年11月11日 0:01:0";
        Date startDate = sdf.parse(start);
        Date endDate = sdf.parse(end);
        Date jiaDate = sdf.parse(jia);
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long jiaTime = jiaDate.getTime();

        if (jiaTime >= startTime && jiaTime <= endTime) {
            System.out.println("在时间段内");
        } else {
            System.out.println("不在时间段内");
        }
    }
    
}
