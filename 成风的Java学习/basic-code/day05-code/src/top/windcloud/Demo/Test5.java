import java.util.Random;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.print("请输入数字：");
            int num2 = sc.nextInt();
            if (num2 > num) {
                System.out.println("数字太大了");
            } else if (num2 < num) {
                System.out.println("数字太小了");
            } else {
                System.out.println("恭喜你猜对了");
                break;
            }
            count ++;
            if (count == 3) {
                System.out.println("悄悄告诉你这个数是" + num);
            }
        }
        
    }
}