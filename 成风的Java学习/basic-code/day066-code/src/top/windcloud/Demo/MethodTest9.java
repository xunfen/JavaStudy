public class MethodTest9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int num = 45;
        boolean flag = contains(arr, num);
        System.out.println(flag);
    }

    public static boolean contains(int[] arr,int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
    
}
