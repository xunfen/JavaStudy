import java.util.Scanner;

public class ifTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = 1000;
        System.out.println("请输入vip等级");
        int vip = sc.nextInt();
        if (vip == 1) {
            price =price * 0.9;
            System.out.println("会员等级为1，折扣为9折，应付金额：" + price);
        }
        else if(vip == 2) {
            price =price * 0.8;
            System.out.println("会员等级为2，折扣为8折，应付金额：" + price);
        }
        else if(vip == 3) {
            price =price * 0.7;
            System.out.println("会员等级为3，折扣为7折，应付金额：" + price);
        }
        else {
            System.out.println("会员等级输入错误！");
        }
    }
    
}
