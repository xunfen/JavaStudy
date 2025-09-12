public class MathTest2 {
    public static void main(String[] args) {
        //自幂数，一个n位自然数等于各个位数上数字的n次幂之和
        //e.g.:153=1^3+5^3+3^3
        //一位数：独身数 三位数：水仙花数 四位数：四叶玫瑰数 五位数：五角星数 六位数：六合数 七位数： 北斗七星数 八位数：八仙数 九位数：九九重阳数 十位数:十全十美数
        //1：统计有多少个水仙花数[100-999]
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;

            double sum = Math.pow(ge,3) + Math.pow(shi,3) + Math.pow(bai,3);

            if (sum == i) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("水仙花数有：" + count);
    }
    
}
