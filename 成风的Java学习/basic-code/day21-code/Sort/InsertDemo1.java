public class InsertDemo1 {
    public static void main(String[] args) {
        int[] arr = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
        int startIndex = -1;//从-1开始查找无序位置，如果本身是有序的，那么-1就是无效索引，将不会执行排序的代码
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }

        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
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
