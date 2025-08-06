import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*
    2019年1月1日起，国家推出新的个人所得税政策，起征点上调值5000元。
    也就是说税前工资扣除三险一金（三险一金数额假设是税前工资的10%）后如果不足5000元，则不交税。
    如果大于5000元，那么大于5000元的部分按梯度交税，具体梯度比例如下：
​	0 ~ 3000元的部分，交税3%		/	
​	3000 ~ 12000元的部分，交税10%   /
​	12000 ~ 25000的部分 ， 交税20%		
​	25000 ~ 35000的部分，交税25%
​	35000 ~ 55000的部分，交税30%		
​	55000 ~ 80000的部分，交税35%
​	超过80000的部分，交税45%
比如：黑马某学员入职一家企业后，税前工资是15000，则他每月该交个税的部分是15000-1500-5000=8500元，个税缴纳数额是3000×3%+5500×10%=640元。税后工资12860元。
请完成一个个税计算程序，在用户输入税前工资后，计算出他对应的纳税数额，以及税后工资为多少？
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入税前工资：");
        int salary =sc.nextInt();
        int insurance = salary * 10 / 100;
        temp = salary - insurance;
        int tax = 0;
        switch (temp) {
            case temp > 0 & temp < 3000:
                tax = temp * 3 / 100;
                break;
            case temp > 3000 & temp < 12000:
                tax = temp * 10 / 100;
                break;
            case temp > 12000 & temp < 25000: 
                tax = temp * 20 / 100;
                break;
            case temp > 25000 & temp < 35000:
                tax = temp * 25 / 100;
                break;
            case temp > 35000 & temp < 55000: 
                tax = temp * 30 / 100;
                break;
            case temp > 55000 & temp < 80000: 
                tax = temp * 35 / 100;
                break;
            case temp > 80000: 
                tax = temp * 45 / 100;
                break;
        }

        System.out.println("税前工资为：" + salary + "，tax为：" + tax + "，税后工资为：" + (salary - tax));
    }
}