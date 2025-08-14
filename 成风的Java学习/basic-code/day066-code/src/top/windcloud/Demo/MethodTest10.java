public class MethodTest10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int from = 3;
        int to = 7;
        int[] copyArr = copyOfRange(arr, from, to);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
    }
    
    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] brr = new int [to - from];
        int index = 0;
        for (int i = from; i <= to; i++) {
            if (i > from && i <= to) {
                brr[index] = arr[i];
                index++;
            }
        }
        return brr;
    }
}
