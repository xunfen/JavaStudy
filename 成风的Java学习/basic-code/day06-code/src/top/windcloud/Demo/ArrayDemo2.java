public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int num = arr[0];//[]内填索引值，索引是从0开始排列的
        System.out.println(num);
        System.out.println(arr[1]);

        //把数据存储到数组中
        arr[0] = 100;
        //一旦覆盖之后，原索引中的数就消失不见了
        System.out.println(arr[0]);
    }
    
}
