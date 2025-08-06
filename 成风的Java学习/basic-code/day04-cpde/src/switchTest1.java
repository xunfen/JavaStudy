import java.util.Scanner;

public class switchTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期几以获取计划");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("跑步");
                break;                          //break千万不能省略，不然就会case穿透，执行每一个case中的语句，直到遇到break
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
            default:                                //default可以省略，但是无输出
                System.out.println("没有这个运动");//default也可以放在其他case的位置，但是一般都在下面
        }
    }
}