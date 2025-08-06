import java.util.Scanner;

public class Test3-2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        
        /*
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


    */
    //二分法：以81的平方根9为中心
    //假设 a * b =81
    //那么a,b中必有一个数大于9，另一个数小于9

    //即：一定有一个数小于等于平方根，另一个数大于等于平方根
    //后期的学习内容
    }
}
