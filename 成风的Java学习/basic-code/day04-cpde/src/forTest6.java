import java.util.Scanner;

public class forTest6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数：");
        int num2 = sc.nextInt();

        int sum = 0;

        for(int i = num1 ; i <= num2 ; i++) {
            if (i % 5 == 0 & i % 3 == 0) {
                sum++;
            }
        }

        System.out.println(sum);
        
    }
}