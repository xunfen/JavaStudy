public class BasicSearch {
    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 4, 1};
        int target = 4;
        System.out.println(search(arr, target));
    }
    public static boolean search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
