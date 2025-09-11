public class MathDemo1 {
    public static void main(String[] args) {
        //abs取绝对值
        System.out.println(Math.abs(-10));
        //int类型取值范围为-2147483648~2147483647，如果-2147483647没有正数与之相对，那么abs结果会有bug
        System.out.println(Math.abs(-2147483648));//2147483647
        //System.out.println(Math.absExact(-2147483648));//报错
        System.out.println("======================");

        //向上取整:向正无穷方向取整
        System.out.println(Math.ceil(10.1));
        System.out.println(Math.ceil(-10.1));//-10
        //向下取整：向负无穷方向取整
        System.out.println(Math.floor(10.1));
        System.out.println(Math.floor(-10.1));//-11
        System.out.println("======================");

        //取整：四舍五入
        System.out.println(Math.round(10.1));
        System.out.println(Math.round(1.6));
        System.out.println(Math.round(-10.1));
        System.out.println(Math.round(-1.6));
        System.out.println("======================");

        //取最大值
        System.out.println(Math.max(10, 20));
        //取最小值
        System.out.println(Math.min(10, 20));
        System.out.println("======================");

        //a的b次幂
        System.out.println(Math.pow(2, 3));//8
        //如果第二个参数为小数，则为开根号
        System.out.println(Math.pow(4, 0.5));
        //第二个参数如果为负数
        System.out.println(Math.pow(2, -2));//0.25
        //开根号(2)
        System.out.println(Math.sqrt(4));
        //开根号(3)
        System.out.println(Math.cbrt(8));
        System.out.println("======================");

        //随机数
        System.out.println(Math.random());//0.0~1.0
        //如果要1~100就乘100然后向下/上取整，还不如Random
    }
    
}