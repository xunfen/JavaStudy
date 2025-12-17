public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 4, 1};
        int target = 4;
        int index = search(arr, target);
        System.out.println(index);
    }
    public static int search (int[] arr, int target) {
        int min = 0;
        int max = arr.length - 1;

        while(true) {
            int mid = (min + max) / 2;

            if (target > max || target < min) {
                return -1;
            }
            
            if (arr[mid] > target) {
                max = mid - 1;
            }
            if (arr[mid] < target) {
                min = mid + 1;
            }
            if (arr[mid] == target) {
                return mid;
            }
        }

    }
}
