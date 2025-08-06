//1.导包
import java.util.Scanner;

public class ScannerTest{
    public static void main(String[] args) {
        //2.创建对象
        Scanner sc = new Scanner(System.in);

        //3.接收数据
        System.out.println("请输入第一个数字：");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int number2 = sc.nextInt();

        System.out.println("两个数字的和是：" + (number1 + number2));
    }
}