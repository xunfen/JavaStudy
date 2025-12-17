public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 3, 4, 1 };
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void quickSort(int arr[], int left, int right) {
        int startIndex = left;
        int endIndex = right;
        int baseNum = arr[left];

        if (left >= right) {
            return;
        }

        while (startIndex != endIndex) {
            // 利用endIndex从右向左找比baseNum小的数
            while (true) {
                if (endIndex <= startIndex || arr[endIndex] < baseNum) {//如果找到比baseNum小的数，就退出循环
                    break;
                }
                endIndex--;//左移指针
            }
            // 利用startIndex从左向右找比baseNum大的数
            while (true) {
                if (startIndex >= endIndex || arr[startIndex] > baseNum) {//如果找到比baseNum大的数，就退出循环
                    break;
                }
                startIndex++;//右移指针
            }
            // 交换两个数据
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
        }
        // 基准元素归位：把基准数放在数组中正确的位置
        arr[left] = arr[startIndex];
        arr[startIndex] = baseNum;

        //排序基准数左边的数据
        if (startIndex > left) {
            quickSort(arr, left, startIndex - 1);
        }

        //排序基准数右边的数据
        if (startIndex < right) {
            quickSort(arr, startIndex + 1, right);
        }

    }
}
