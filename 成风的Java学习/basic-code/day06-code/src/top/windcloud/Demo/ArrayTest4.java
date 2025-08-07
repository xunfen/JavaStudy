public class ArrayTest4 {
    public static void main(String[] args) {
        int[] arr = {33,5,55,44,22};
        //int temp = 0;不能为0,如果数组里面都是负数呢？0就会出问题
        int temp = arr[0];
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }
    
}
