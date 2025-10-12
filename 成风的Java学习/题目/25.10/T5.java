import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改
//这一版运行超时了，故废

public class T5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 在此输入您的代码...
        int target = scan.nextInt();
        int point = 0;
        int day = 0;
        if (target == 0) {
            System.out.println("0");
        }
        while (true) {
            day++;
            if (day % 5 == 1 || day % 5 == 2 || day % 5 == 3) {
                point++;
            } else {
                point--;
            }
            if (point == target) {
                System.out.println(day);
                break;
            }
        }
        scan.close();
    }

}