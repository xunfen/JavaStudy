//1.导包
import java.util.Scanner;
public class Tes3HSILI {
    public static void main(String[] args) {
        // 2.创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        // 3.调用方法获取键盘录入的本金和存取年限
        System.out.println("请输入存款金额：");
        int money = sc.nextInt();
        System.out.println("请输入存款年限：");
        int year = sc.nextInt();
        // 4.定义本息和的变量
        double outMoney = 0;
        // 5.根据利率和年限计算本息和
        if (year == 1) {
            outMoney = money + money * 2.25 / 100 * 1;
        } else if (year == 2) {
            outMoney = money + money * 2.7 / 100 * 2;
        } else if (year == 3) {
            outMoney = money + money * 3.25 / 100 * 3;
        } else if (year == 5) {
            outMoney = money + money * 3.6 / 100 * 5;
        } else {
            System.out.println("输入的年限有误");
        }
        // 6.打印输出
        System.out.println("存款" + year + "年后的本息是：" + outMoney);
    }
}