import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class T3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 在此输入您的代码...
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();

        int count;
        
        // 处理特殊情况：当A或B为0时
        if (A == 0 && B == 0) {
            // 根据题目，A+B≥1，所以这种情况不会出现
            count = 0;
        } else if (A == 0) {
            // 如果不需要星银矿，剑的数量由龙之精粹决定
            count = D / B;
        } else if (B == 0) {
            // 如果不需要龙之精粹，剑的数量由星银矿决定
            count = C / A;
        } else {
            // 两种材料都需要，取较小值
            int star = C / A;
            int dragon = D / B;
            count = Math.min(star, dragon);
        }
        
        System.out.println(count);
        scan.close();
    }
}