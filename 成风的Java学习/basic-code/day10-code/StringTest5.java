import java.util.Scanner;

public class StringTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = sc.nextLine();
        String result = reverse(str);
        System.out.println(result);
    }

    public static String reverse(String str) {
        String result = "";
        for(int r = str.length() - 1; r >= 0; r--) {
            result = result + str.charAt(r);
        }
        return result;
    }
    
}
