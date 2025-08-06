import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        //定义一个变量，表示标记是否为质数
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                //System.out.println(num + "不是质数");
                break;
            }
        }

        if (flag) {
            System.out.println(num + "是质数");
        } else {
            System.out.println(num + "不是质数");
        }


    
    }
}
