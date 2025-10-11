import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 在此输入您的代码...
        // 得到矩阵数据
        int n = scan.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        int max = matrix[0][0];
        int min = matrix[0][0];
        int tempMax, tempMin;

        // 遍历矩阵以对比最大值最小值
        for (int i = 0; i < n; i++) {
            // 主对角线【i,i】
            // 副对角线【i，n-i-1】
            int tempMaxMain = matrix[i][i];
            int tempMaxAux = matrix[i][n - i - 1];
            tempMax = tempMaxMain > tempMaxAux ? tempMaxMain : tempMaxAux;
            max = max > tempMax ? max : tempMax;
        }

        for (int i = 0; i < n; i++) {
            int tempMinMain = matrix[i][i];
            int tempMinAux = matrix[i][n - i - 1];
            tempMin = tempMinMain < tempMinAux ? tempMinMain : tempMinAux;
            min = min < tempMin ? min : tempMin;
        }

        System.out.println(max + " " + min);
        scan.close();
    }
}