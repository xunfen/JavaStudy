import java.util.Scanner;

public class StringBuilderTest1 {
    public static void main(String[] args) {
        
        //使用StringBuilder的场景:
        //1.字符串拼接
        //2.字符串反转

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        //链式编程：String result = new StringBuilde().append(str).reverse().toString();
        //System.out.println(sb);
        String result = sb.toString();
        if (str.equals(result)) {
            System.out.println("当前字符串是对称字符串");
        } else {
            System.out.println("当前字符串不是对称字符串");
        }
    }
    
}
