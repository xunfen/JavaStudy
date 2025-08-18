public class twoDimensionDemo2 {
    public static void main(String[] args) {
        //动态初始化
        //int[][] arr = new int[m][n];
        //m:表示二维数组可以存多少个一维数组
        //n:表示每个一维数组可以存多少个元素
        int[][] arr = new int[3][5];
        arr[0][0] = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
    
}
