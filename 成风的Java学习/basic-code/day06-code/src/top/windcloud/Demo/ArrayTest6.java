public class ArrayTest6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {1,2,3,4,5};
        int a = arr.length;
        for (int i = 0; i < arr.length; i++) {
            arr[a - 1] = arr1[i];
            a--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
    
}
