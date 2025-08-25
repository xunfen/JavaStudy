import java.util.Scanner;

public class StringTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.nextLine();
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z') {//char类型的变量在参与计算时，会自动提升类型为int,查询ascii码表
                smallCount++;
            } else if(c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if(c >= '0' && c <= '9') {//一定要加‘’，否则就是ascii中的0-9所代表的字符
                numberCount++;
            }
        }
        System.out.println("大写字母的个数:" + bigCount);
        System.out.println("小写字母的个数:" + smallCount);
        System.out.println("数字的个数:" + numberCount);
    }
    
}
