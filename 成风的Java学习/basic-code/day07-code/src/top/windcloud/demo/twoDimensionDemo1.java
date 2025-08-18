public class twoDimensionDemo1 {
    public static void main(String[] args) {
        //二维数组：数组里面存数组，最外面的大数组叫做二维数组
        //1.静态初始化
        int[][] arr = new int[][]{{11,22},{33,44}};
        int[][] brr = {{11,22},{33,44}};
        int[][] crr = {
            {11,22},
            {33,44}
        };
        //System.out.println(arr[0]);
        //[I@279f2327地址值，获取二维数组中第一个数组的地址值

        /* System.out.println(arr[0][0]);//11
        System.out.println(arr[0][1]);//22 */
        //第一个括号表示数组的索引，第二个括号表示数组中的索引
        /* arr[i][j]
        i:二维数组的索引，出来的是里面的一维数组
        j：一维数组的索引，出来是里面的元素
 */
        //二维数组的遍历
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }



    }
    
}
