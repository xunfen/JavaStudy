import java.util.StringJoiner;//不要忘记导包！

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        //StringJoiner sj = new StringJoiner(",");//指定间隔符号,没有空参构造，会报错
        StringJoiner sj = new StringJoiner(",", "[", "]");//间隔符号 开始符号 结束符号
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj);
    }
}
