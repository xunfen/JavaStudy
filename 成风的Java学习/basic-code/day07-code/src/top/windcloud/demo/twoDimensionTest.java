public class twoDimensionTest {
    public static void main(String[] args) {
        int[][] arr = { { 22, 66, 44 }, { 77, 33, 88 }, { 25, 45, 65 }, { 11, 66, 99 } };
        int yearSum =0;
        for (int i = 0; i < arr.length; i++) {
            int[] quarterArr = arr[i];
            int sum = getSum(quarterArr);
            System.out.println("第" + (i + 1) + "个季度营业额为：" + sum);
            yearSum += sum;
        }
        System.out.println("全年营业额为：" + yearSum);
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

}
