import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字:");
        int x = sc.nextInt();
        for (int i = 1 ; i < x ; i++)
        if (i * i == x) {
            System.out.println(i + "是" + x + "的平方数");
            break;
        } else if (i * i > x) {
            System.out.println((i - 1) + "是" + x + "的平方数");
            break;
        }
    }
}
