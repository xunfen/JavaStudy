import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int min;
        int num3 = sc.nextInt();
        if (num1 < num2 & num1 < num3) {
            min = num1;
        }
        else if (num2 < num1 & num2 < num3) {
            min = num2;
        }
        else {
            min = num3;
        }
        System.out.println(min);
    }
    
}
