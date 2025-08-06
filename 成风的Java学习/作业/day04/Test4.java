import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        /*
    某商场购物可以打折，具体规则如下：
​	普通顾客购不满100元不打折，满100元打9折；
​	会员购物不满200元打8折，满200元打7.5折；
​	不同打折规则不累加计算。
请根据此优惠计划进行购物结算，键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），输出应付金额（小数类型）。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入顾客类别：");
        int type = sc.nextInt();
        System.out.println("请输入购物金额：");
        int money = sc.nextInt();
        if (type == 0) {
            if (money > 0 & money < 100) {
                System.out.println("应付金额：" + money);
            }
            else if (money >= 100) {
                System.out.println("应付金额：" + money * 0.9);
            }
            else {
                System.out.println("输入金额错误");
            }
        }
        else if (type == 1) {
            if (money > 0 & money < 200) {
                System.out.println("应付金额：" + money * 0.8);
            }
            else if (money >= 200) {
                System.out.println("应付金额：" + money * 0.75);
            }
            else {
                System.out.println("输入金额错误");
            }
        }
        else {
            System.out.println("输入顾客类别错误");
        }
    }
}