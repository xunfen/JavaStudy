public class BinarySearchDemo1 {
    public static void main(String[] args) {
        //二分查找：1.数组必须是有序的
        int[] arr = {1, 8, 10, 89, 1000, 1000, 1234};
        int target = 89;
        int index = binarySearch(arr, target);
        System.out.println(index);

    }

    public static int binarySearch(int[] arr, int target) {
        int min = 0;
        int max = arr.length - 1;
        while (true) {
            if (min > max) {
                return -1;
            }

            int mid = (min + max) / 2;
            if (arr[mid] > target) {
                max = mid - 1;
            } else if (arr[mid] < target) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
    }
    
}
