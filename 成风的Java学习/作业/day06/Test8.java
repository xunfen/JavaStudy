public class Test8 {
    public static void main(String[] args) {
        /*需求：
            定义一个方法fill(int[] arr,int fromIndex,int toIndex,int value)
        功能：
            将数组arr中的元素从索引fromIndex开始到toIndex（不包含toIndex）对应的值改为value */
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int fromIndex = 3;
        int toIndex = 7;
        int value = 66;
        fill(arr,fromIndex,toIndex,value);
    }

    public static void fill(int[] arr,int fromIndex,int toIndex,int value) {
        for (int i = fromIndex; i < toIndex; i++) {
            arr[i] = value;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}