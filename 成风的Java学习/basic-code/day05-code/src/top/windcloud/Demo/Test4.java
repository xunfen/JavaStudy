import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10);//范围一定是从0开始，但是包左不包又，即0-9
        System.out.println(num);
        //生成任意随机数
        /*
         * 1.让这个范围头尾都减去一个值,从0开始         7-15  ->  0-8
         * 2.尾巴+1                                             0-8  -> 0-9
         * 3.最后再加上第一步减去的值
         */
        int num2 = r.nextInt(9);
        num2 = num2 + 7;
        System.out.println(num2);
    }
}
