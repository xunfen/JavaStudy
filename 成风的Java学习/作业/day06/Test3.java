import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。执行效果如下：
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int num3 = sc.nextInt();
        sort(num1,num2,num3);
    }

    public static void sort(int num1, int num2, int num3) {
        int temp1 = num1 > num2 ? num1 : num2;
        int max = num3 > temp1 ? num3 : temp1;
        int temp2 = num1 < num2 ? num1 : num2;
        int min = num3 < temp2 ? num3 : temp2;
        int mid = num1 + num2 + num3 - max - min;
        System.out.println("排序后的结果为：" + min + " " + mid + " " + max);

    }

}