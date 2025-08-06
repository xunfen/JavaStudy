import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择服务项");
        int n = sc.nextInt();

        switch (n) {
            case 1 -> System.out.println("1机票查询");
            case 2 -> System.out.println("2机票预订");
            case 3 -> System.out.println("3机票改签");
            case 4 -> System.out.println("4退出服务");
            default -> System.out.println("输入错误");
        }
    }
}