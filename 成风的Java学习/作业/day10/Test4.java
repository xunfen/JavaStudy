import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        /* 
        生成验证码
            内容：可以是小写字母，也可以是大写字母，还可以是数字
            规则：
                长度为5
                内容中是四位字母，1位数字。
                其中数字只有1位，但是可以出现在任意的位置。 */
        //把所有大小写字母写到一个数组里
        char[] arr = new char[52];
        for (int i = 0; i < 26; i++) {
            arr[i] = (char)('a' + i);
        }
        for (int i = 0; i < 26; i++) {
            arr[i + 26] = (char)('A' + i);
        }

        //数组中随机获取4次
        String str = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int count = r.nextInt(52);
            str = str + arr[count];
        }

        //随机数字并拼接到最后
        str = str + r.nextInt(10);
        //System.out.println(str);

        //同上题随机打乱字符串
        char[] c = str.toCharArray();
        char temp;
        int index = r.nextInt(c.length);
        temp = c[index];
        c[index] = c[c.length - 1];
        c[c.length - 1] = temp;

        System.out.println(new String(c));



    }
    
}
