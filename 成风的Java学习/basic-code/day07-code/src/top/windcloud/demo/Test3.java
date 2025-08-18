import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        /*
验证码格式：
长度为5
前四位是大写字母或者小写字母
最后一位是数字 */
        Random r = new Random();
        //如果要在一堆没有什么规律的数据中抽取，把他们放到数组中，数组的索引是有规律的，在随机抽取索引
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //ascii码表中 a-z 97-122 A-Z 65-90
            //添加小写字母
            if (i <= 25) {
                chs[i] = (char) (97 + i);
            } else {
                //添加大写字母
                chs[i] = (char) (65 + i - 26);
            }
            
        }

        String result = "";

        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            result = result + chs[randomIndex];
        }

        result = result + r.nextInt(10);

        System.out.println(result);


        /* for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] + " ");
        } */

    }
    
}
