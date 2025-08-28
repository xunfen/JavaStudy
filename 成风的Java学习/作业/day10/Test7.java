import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        //请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。比如：Hello12345World中字母：10个，数字：5个。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        int abcCount = 0;
        int numCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                abcCount++;
            }
            if (c >= '0' && c <= '9') {
                numCount++;
            }
        }
        System.out.println("字符串中英文字母的个数是：" + abcCount);
        System.out.println("字符串中的数字的个数是：" + numCount);

    }
    
}
