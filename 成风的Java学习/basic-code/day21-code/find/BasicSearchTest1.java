public class BasicSearchTest1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int result = basicSearch(arr, target);
        if(result != -1) {
            System.out.println(result);
        } else if (result == -1) {
            System.out.println("Not Found");
        }
    }

    public static int basicSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
}
