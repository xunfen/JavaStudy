import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        //键盘录入两个数字number1和number2表示一个范围，求这个范围之内的数字和。
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字1：");
        int num1 = sc.nextInt();
        System.out.println("请输入数字2：");
        int num2 = sc.nextInt();
        int temp = 0;
        for (int i = num1 ; i <= num2 ; i++) {
            temp = temp + i;
        }
        System.out.println(temp);
        但是你并不知道num1大还是num2大，所以要先判断
        */
        
        Scanner sc = new Scanner(System.in); // 这行也被注释掉了，需要取消注释
        System.out.println("请输入数字1：");
        int num1 = sc.nextInt();
        System.out.println("请输入数字2：");
        int num2 = sc.nextInt();
        int temp = 0;
        if (num1 > num2) {
            for (int i = num2 ; i <= num1 ; i++) {
                temp = temp + i;
            }
            System.out.println(temp);
        }
        else if (num1 < num2) {
            for (int i =num1 ; i <= num2 ; i++){
                temp = temp + i;
            }
            System.out.println(temp);
        }
        else { // 当num1 == num2时的情况
            System.out.println(num1);
        }
    } // 这个大括号用来结束main方法
    
}
