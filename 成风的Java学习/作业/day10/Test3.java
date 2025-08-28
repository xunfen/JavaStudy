import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //键盘输入任意字符串，打乱里面的顺序
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入任意字符串：");
        String str = sc.next();
        String newStr = shuffle(str);
        System.out.println("打乱后的字符串为：" + newStr);
        
    }

    public static String shuffle(String str) {
        char[] c = str.toCharArray();
        char temp;
        Random r = new Random();
        for (int i = 0; i < c.length - 1;i++) {
            int index = r.nextInt(c.length);
            temp = c[index];
            c[index] = c[i];
            c[i] = temp;
        }
        return new String(c);
    }
    
}
