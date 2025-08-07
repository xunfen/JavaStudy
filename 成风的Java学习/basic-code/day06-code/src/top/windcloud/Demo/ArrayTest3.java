public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0 ; i < arr.length ; i++){
            if (arr[i] % 2 == 1) {
                //System.out.println(arr[i] * 2);
                arr[i] = arr[i] * 2;
            } else {
                //System.out.println(arr[i] / 2);
                arr[i] = arr[i] / 2;
            }
        }
        
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
