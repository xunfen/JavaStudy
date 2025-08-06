package top.windcloud.arithmeticoperator;

public class Logicoperator {
    public static void main(String[] args) {
        //并且&：俩边都为真，结果才为真
        System.out.println(true & true );// true
        System.out.println(true & false);// false
        System.out.println(false & true);// false
        System.out.println(false & false);// false

        //或者|：俩边都为假，结果才为假，只要有一个为真，结果就为真
        System.out.println(true | true );// true
        System.out.println(true | false);// true
        System.out.println(false | true);// true
        System.out.println(false | false);// false

        //异或^：俩边不相同，结果为真（用处比较少）
        System.out.println(true ^ true );// false
        System.out.println(true ^ false);// true
        System.out.println(false ^ true);// true
        System.out.println(false ^ false);// false

        //非！：取反，结果为真变假，结果为假变真
        //感叹号要么不写，要么只写一次！
        System.out.println(!true);//false
        System.out.println(!false);//true

        //短路逻辑运算符
        //短路与&&：左侧为假，右侧不再执行，俩边都为真，结果才为真
        System.out.println(true && true );// true
        System.out.println(false && false);//false
        System.out.println(true && false);//false
        System.out.println(false && true);//false

        //短路或||：左侧为真，右侧不再执行，只要有一个为真，结果就为真
        System.out.println(true || true );// true
        System.out.println(false || false);//false
        System.out.println(true || false);//true
        System.out.println(false || true);//true

        int a = 10;
        int b = 10;
        boolean result = ++a <5 && ++b < 5;
        System.out.println(result);//false
        System.out.println(a);//11
        System.out.println(b);//10
        //短路逻辑运算符既有短路效果，当左边表达式满足最终结果时，右侧不再参与运行

        //以下为普通逻辑运算符对比
        int c = 10;
        int d = 10;
        boolean result2 = ++c <5 & ++d < 5;
        System.out.println(result2);//false
        System.out.println(c);//11
        System.out.println(d);//11

    }
}