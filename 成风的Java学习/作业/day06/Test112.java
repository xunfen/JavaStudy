import java.util.Random;

public class Test112 {
    public static void main(String[] args) {
        /*
一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下：（随机顺序，不一定是下面的顺序）

```
888元的奖金被抽出
588元的奖金被抽出
10000元的奖金被抽出
1000元的奖金被抽出
2元的奖金被抽出
``` */
        int[] arr = {2, 588, 888, 1000, 10000};
        ran(arr);

        //感觉原来的写法实现是能实现，就是感觉不太好，查了查发现ai给的是fisher-yates算法，故尝试一下
        //初学者不保证以下代码是真正意义上的fisher-yates算法
    }

    public static void ran(int[] arr) {
        Random r = new Random();
        int temp = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            int index = r.nextInt(arr.length);
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] +  "元的奖金被抽出");
        }

    }
}