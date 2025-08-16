import java.util.Random;

public class Test11 {
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
    }

    public static void ran(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            if (arr[index] == 0) {
                i--;
            } else {
                System.out.println(arr[index] + "元的奖金被抽出");
                arr[index] = 0;
            }
        }

    }
}