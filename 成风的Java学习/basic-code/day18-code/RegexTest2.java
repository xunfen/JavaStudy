import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexTest2 {
    public static void main(String[] args) {
        String str = "来黑马程序员学习Java， 手机号:18512516758，18512508907或者联系邮箱:boniu@itcast.cn， 座机电话:01036517895，010-98951256邮箱:bozai@itcast.cn， 热线电话:400-618-9090 ，400-618-4000，4006184000，4006189090";
        
        /* Pattern Phone = Pattern.compile("0?(13|14|15|18|17)[0-9]{9}");
        Matcher PhoneMatcher = Phone.matcher(str);

        System.out.println("手机号：");
        while(PhoneMatcher.find()){
            String phoneNum = PhoneMatcher.group();
            System.out.println(phoneNum);
        }

        System.out.println("===================================");

        Pattern Email = Pattern.compile("\\w+@\\w+\\.\\w+");
        Matcher EmailMatcher = Email.matcher(str);

        System.out.println("邮箱：");
        while(EmailMatcher.find()){
            String email = EmailMatcher.group();
            System.out.println(email);
        }

        System.out.println("===================================");

        Pattern Tel = Pattern.compile("400-?[1-9]\\d{2}-?[1-9]\\d{3}");
        Matcher TelMatcher = Tel.matcher(str);

        System.out.println("电话：");
        while(TelMatcher.find()){
            String tel = TelMatcher.group();
            System.out.println(tel);
        } */

        String regex = "0?(13|14|15|18|17)[0-9]{9}" + "|\\w+@\\w+\\.\\w+" + "|400-?[1-9]\\d{2}-?[1-9]\\d{3}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
            System.out.println("===================================");
            
        }
    }
    
}
