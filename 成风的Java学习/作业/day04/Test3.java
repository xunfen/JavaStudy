import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /* 
         * 某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
​	存期		年利率（%）
​	一年		2.25
​	两年		2.7
​	三年		3.25
​	五年		3.6
请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入存款金额：");
        int money = sc.nextInt();
        System.out.println("请输入存款年限：");
        int year = sc.nextInt();
        double outMoney = 0;
        /*switch (year) {
            case 1:
                outMoney = money * 2.25 / 100 * 1 + money;
                System.out.println("本息总额为：" + outMoney);
                break;
            case 2:
                outMoney = money * 2.7 / 100 * 2 + money;
                System.out.println("本息总额为：" + outMoney);
                break;
            case 3:
                outMoney = money * 3.25 / 100 * 3 + money;
                System.out.println("本息总额为：" + outMoney);
                break;
            case 5:
                outMoney = money * 3.6 / 100 * 5 + money;
                System.out.println("本息总额为：" + outMoney);
                break;
            default:
                System.out.println("输入年限错误！");
                break;
        }
                
        switch不能用于范围判断！！！
        吃一见长一智*/

        if (year == 1) {
            outMoney = money * 2.25 / 100 * 1 + money;
            System.out.println("本息总额为：" + outMoney);
        }
        else if (year == 2) {
            outMoney = money * 2.7 / 100 * 2 + money;
            System.out.println("本息总额为：" + outMoney);
        }
        else if (year == 3) {
            outMoney = money * 3.25 / 100 * 3 + money;
            System.out.println("本息总额为：" + outMoney);
        }
        else if (year == 5) {
            outMoney = money * 3.6 / 100 * 5 + money;
            System.out.println("本息总额为：" + outMoney);
        }
        else {
            System.out.println("输入年限错误！");
        }


    }
}