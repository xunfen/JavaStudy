import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
    public static void main(String[] args) {
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持的版本，下一个长期支持的版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        Pattern p = Pattern.compile("Java\\d{0,2}");//创建pattern对象并交给他正则

        Matcher m = p.matcher(str);//创建matcher对象并交给他字符串

        while(m.find()){//循环匹配，如果找不到m.find为false终止循环
            String s = m.group();//获取匹配的字符串并赋值给s
            System.out.println(s);
        }
    }
    
}
