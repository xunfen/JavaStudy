import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        //得到有多少个数字
        int n = scan.nextInt();
        int[] grade = new int[n];
        //遍历把数据填充到数组中
        for(int i = 0; i < n; i++) {
            grade[i] = scan.nextInt();
        }
        
        //创建一个数组来存储积分的元素->似乎不用数组，直接求和
        //int[] sum = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (!isExist(grade, grade[i] - 1)) {
                sum = sum + grade[i];
            }
        }
        System.out.println(sum);
        
        scan.close();
    }

    //定义一个方法用来匹配n-1是否处于数组中
    public static boolean isExist(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}