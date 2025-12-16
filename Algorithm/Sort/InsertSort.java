public class InsertSort {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 3, 4, 1 };
        // 1.找到无序的那一组数据是从哪个索引开始的
        int startIndex = -1;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i;
                break;
            }
        }
        System.out.println("数列乱序索引开始为：" + startIndex);

        for (int i = startIndex; i <= arr.length - 1; i++) {// 从乱序索引开始，开始排序，每次循环都会排序好让乱序开始的索引往右移一位
            int j = i;//变量i我们是要用的，不能随意更改，所以把他赋值给j
            while (j > 0 && arr[j] < arr[j - 1]){//然后这里从乱序开始的所以开始遍历前面前面已经排序好的数据，一旦比前一个小就插入到对应位置
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}