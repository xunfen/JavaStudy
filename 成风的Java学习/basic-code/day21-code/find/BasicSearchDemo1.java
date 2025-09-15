public class BasicSearchDemo1 {
    public static void main(String[] args) {
        //基本查找：从0索引开始挨个往后查找
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        int target = 17;
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
