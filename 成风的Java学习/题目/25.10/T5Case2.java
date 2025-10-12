import java.util.Scanner;

public class T5Case2 {
    public static void main(String[] args) {
        // 创建Scanner对象用于读取输入
        Scanner scan = new Scanner(System.in);
        
        // 读取目标位置N
        int N = scan.nextInt();
        
        // 如果目标位置是0，直接输出0天（起点就是0）
        if (N == 0) {
            System.out.println(0);
        }
        
        // 初始化结果为最大值，用于后续比较
        long result = Long.MAX_VALUE;
        
        // 检查三种可能的情况
        // 在一个周期内，小蓝会到达的位置是：k+1, k+2, k+3
        // 所以N可能等于k+1, k+2或k+3
        for (int offset = 1; offset <= 3; offset++) {//得到一个周期内前三天会超出的值
            // 计算周期数k = N - offset
            // 例如：如果N=4，offset=1，则k=3，表示在第3个周期
            long k = N - offset;
            
            // 确保周期数k不为负（即N>=offset）
            if (k >= 0) {
                // 计算到达N所需的天数
                // 5*k表示前k个周期的总天数
                // offset表示在当前周期内的第几天
                result = Math.min(result, 5L * k + offset);
            }
        }
        
        // 输出最小天数
        System.out.println(result);
        
        // 关闭Scanner
        scan.close();
    }
}