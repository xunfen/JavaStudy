import java.util.Scanner;

public class alo {
    public static void main(String[] args) {
        //键盘录入
        //第一套体系
        //nextInt();接收整数
        //nextDouble();接收小数
        //next();接收字符串
        //遇到空格，回车，制表符就停止接收

        //第二套体系
        //nextLine();接收字符串,可以接收空格，制表符，遇到回车才停止接收数据

        //俩套体系不能混用！！！
        //先用nextInt再用nextLine会导致下面的nextLine接受不到数据

        /* Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数：");
        int num = sc.nextInt();
        System.out.println(num);
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();
        System.out.println(num2); */

        /* Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str1 = sc.next();
        System.out.println(str1);
        System.out.println("请输入第二个字符串：");
        String str2 = sc.next();
        System.out.println(str2); */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符：");
        String lin1 = sc.nextLine();
        System.out.println(lin1);
        System.out.println("请输入第二个字符：");
        String lin2 = sc.nextLine();
        System.out.println(lin2);


    }
    
}
