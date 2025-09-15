public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6,1,2,7,9,3,4,5,10,8};
        quickSort(arr, 0, arr.length - 1);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;
        

        if (start > end) {
            return;
        }

        int baseNum = arr[i];//要先经过上面的if判断，如果已经排序完，传过来的i是10，那么就会把索引10的元素给baseNum了，然鹅并不存在10索引，市议会报错

        while (start != end) {
            while(true) {
                if(end <= start || arr[end] < baseNum) {
                    break;
                }
                end--;
            }
            while(true) {
                if(start >= end || arr[start] > baseNum) {
                    break;
                }
                start++;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);

    }
    
}
