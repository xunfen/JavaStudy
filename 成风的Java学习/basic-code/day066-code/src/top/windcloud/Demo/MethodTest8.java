public class MethodTest8 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,5,11,6,7,8,9};
        compare(arr);
    }


    public static void compare(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    
}
