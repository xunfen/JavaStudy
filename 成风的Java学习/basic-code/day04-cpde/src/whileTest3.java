import java.util.Scanner;

public class whileTest3 {
    public static void main(String[] args) {
        /*
         * 给你两个整数，被除数 dividend 和除数 divisor。将两数相除，要求 不使用 乘法(*)、除法(/)和取余(%)运算。
         * 力扣通过率22.5%
         * tips:被除数 / 除数 = 商 ... 余数
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数：");
        int dividend = sc.nextInt();
        System.out.println("请输入除数：");
        int divisor = sc.nextInt();
        int count = 0;
        while (dividend >= divisor) {
            int temp = dividend - divisor;
            dividend = temp;
            count++;
        }
        System.out.println("商" + count);
        System.out.println("余数" + dividend);


    }
    
}
