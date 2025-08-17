import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原价");
        double price = sc.nextDouble();

        System.out.println("请输入月份");
        int month = sc.nextInt();

        System.out.println("请输入舱型");
        int type = sc.nextInt();
        //1为经济舱，2为头等舱

        if (month >= 5 && month <= 10) {
            if (type == 1) {
                price = price * 0.9;
                System.out.println("优惠后的价格是：" + price);
            } else if (type == 2) {
                price = price * 0.85;
                System.out.println("优惠后的价格是：" + price);
            } else {
                System.out.println("请输入正确的舱型");
            }
        } else if ((month >= 11 && month <= 12) || (month >= 1 && month < 5)) {
            if (type == 1) {
                price = price * 0.65;
                System.out.println("优惠后的价格是：" + price);
            } else if (type == 2) {
                price = price * 0.7;
                System.out.println("优惠后的价格是：" + price);
            } else {
                System.out.println("请输入正确的舱型");
            }
        } else {
            System.out.println("请输入正确的月份");
        }


    }
    
}
