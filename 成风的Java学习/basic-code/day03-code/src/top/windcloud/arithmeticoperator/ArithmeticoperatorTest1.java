package top.windcloud.arithmeticoperator;

import java.util.Scanner;

public class ArithmeticoperatorTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("输入的数字是：" + num);

        int b = num / 100;
        System.out.println("百位数字是：" + b);

        int s = (num % 100) / 10;
        System.out.println("十位数字是：" + s);

        int g = num % 10;
        System.out.println("个位数字是：" + g);

    }
}
