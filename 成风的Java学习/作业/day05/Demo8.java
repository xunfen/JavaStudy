public class Demo8 {
    public static void main(String[] args) {
        //1.定义原数组
        int[] arr = {1,2,3,4,5};
        //2.定义空数组
        int[] brr = new int[arr.length];
        //3.定义变量代表奇数要存放的位置
        int left = 0;
        //4.定义变量代表偶数要存放的位置
        int right = arr.length-1;
        //5.对原数组进行遍历
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1){
                //5.1如果是奇数就往左边放
                brr[left] = arr[i];
                //5.2存放之后让索引向右移动
                left++;
            }else{
                //5.3如果是偶数就往右边放
                brr[right] = arr[i];
                //5.4存放之后让索引向左移动
                right--;
            }
        }
        //6.打印brr数组
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}