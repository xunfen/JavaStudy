import java.util.Scanner;

public class ifDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的余额");
        double money = sc.nextDouble();
        if (money >= 100) {
            System.out.println("吃网红餐厅");
        }
        else {
            System.out.println("吃沙县大酒店");
        }
    }
}
