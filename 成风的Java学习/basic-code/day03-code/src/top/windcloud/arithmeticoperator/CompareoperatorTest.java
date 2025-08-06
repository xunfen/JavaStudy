import java.util.Scanner;

public class CompareoperatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //键盘录入俩个整数表示衣服的时髦度
        System.out.println("请输入自己的时髦度");
        int fashion1 = sc.nextInt();
        
        System.out.println("请输入对象的时髦度");
        int fashion2 = sc.nextInt();

        //对比我与对象的时髦度
        boolean result = fashion1 > fashion2;

        System.out.println(result);
    }
}
