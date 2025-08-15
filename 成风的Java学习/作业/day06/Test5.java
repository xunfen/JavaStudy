import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*键盘录入一个正整数
            定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
            在main方法中打印该数字是几位数*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int number = sc.nextInt();
        getLength(number);
    }

    public static void getLength(int number) {
        int length = 0;
        for(int i = 1;i < number ;i = i * 10) {
            if (number / i != 0) {
                length++;
            }
        }
        
        System.out.println(length);
    }

}