import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random r = new Random();
        int temp;
        for (int i = arr.length - 1; i > 0; i--) {
            int index = r.nextInt(i + 1);
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        /* for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        } */

       //以四个一组的方式添加到二维数组中
       int[][] data = new int[4][4];
       //法一:遍历一维数组然后附给二维数组
       /* for (int i = 0; i < arr.length; i++) {
        data[i / 4][i % 4] = arr[i];//这方法妙啊，太妙了
       }

       //遍历检查一下
       for (int i = 0; i < data.length; i++) {
        for (int j = 0; j < data[i].length; j++) {
            System.out.print(data[i][j] + " ");
        }
        System.out.println();
       } */

       //法二：遍历二维数组，然后给他赋值
       int index = 0;
       for (int i = 0; i < data.length; i++) {
        for (int j = 0; j < data[i].length; j++) {
            data[i][j] = arr[index];
            index++;
        }
       }

       //遍历检查一下
       /* for (int i = 0; i < data.length; i++) {
        for (int j = 0; j < data[i].length; j++) {
            System.out.print(data[i][j] + " ");
        }
        System.out.println();
       } */
       
    }
    
}

//fisher-yates算法
/* 设当前索引 i 为数组的最后一个元素的索引（arr.length - 1）。

当 i > 0 时，循环：
a. 生成随机索引 index：范围在 [0, i]（包括 0 和 i）之间的一个随机整数。
b. 交换元素：交换数组中索引为 i 和索引为 index 的两个元素。
c. 缩小范围：将 i 减 1，缩小随机选择的范围。

当循环结束（i == 0），数组已被完全随机打乱。
 */