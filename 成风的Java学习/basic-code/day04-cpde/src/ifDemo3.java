import java.util.Scanner;

public class ifDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的成绩");
        int score = sc.nextInt();
        
        if (score >= 0 && score <= 100) {
            if (score <= 100 && score > 95) {
                System.out.println("bike");
            } else if (score <= 95 && score > 90) {
                System.out.println("playground");
            } else if (score <= 90 && score > 80) {
                System.out.println("bianxinjingan");
            } else {
                System.out.println("dayidun");
            }
        } else {
            System.out.println("buhefa");
        }
    }
}