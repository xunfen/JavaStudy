import java.util.Scanner;

public class whileTest2 {
    public static void main(String[] args) {

        /* 输入一个数，将这个数倒序输出
         * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
         * 力扣通过率56.4%
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int x = sc.nextInt();
        int temp = x;
        int num = 0;
        while (x != 0) {
            int ge = x % 10;
            x = x / 10;
            num = num * 10 + ge;
        }
        System.out.println(num);
        System.out.println(x);
        System.out.println(temp);
        System.out.println(num == temp);

    }
    
}



/*
 * 以下为对代码的解析
 * 1.定义题目所给x
 * 2.将x赋值给临时变量temp（x在循环体中会被减为0）
 * 3.定义一个变量num用来储存每一步的中间值
 * 4.取个位数并赋于ge
 * 5.x再除以十以得到剩下的数，并附给新x
 * 6.num乘10并加上ge得到新num
 * 7.循环执行4-6，直到x为0
 * 8.示例：123456 -> sum = 6 -> sum =65 -> sum = 654 -> ... -> sum = 654321
 * 9.判断num是否等于temp，输出true或false
*/