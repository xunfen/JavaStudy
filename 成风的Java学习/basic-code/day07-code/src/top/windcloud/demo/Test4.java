public class Test4 {
    public static void main(String[] args) {
        //把一个数组中的元素复制到另一个新数组中去。
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] brr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }

        for(int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
    
}
