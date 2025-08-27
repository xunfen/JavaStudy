import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        sj.add("aaa").add("bbb").add("ccc");
        int len = sj.length();
        System.out.println(sj);
        System.out.println(len);//表示的是字符的个数

        String str = sj.toString();
        System.out.println(str);
    }
    
}
