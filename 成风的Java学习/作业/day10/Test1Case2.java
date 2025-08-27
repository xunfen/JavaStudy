import java.util.Scanner;
//力扣T12，通过率60+%

public class Test1Case2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一个数：");
            str = sc.next();
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("输入的数字不合法！");
                continue;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //System.out.println(c);
            String s = changeLuoMa(c);
            sb.append(s);
        }
        System.out.println(sb);
    }

    public static boolean checkStr(String str) {
        // 长度小于等于9
        if (str.length() > 9) {
            return false;
        }

        // 只能是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);// 获取到的是char类型的字符而不是数字，所以下面要与'0''9'比较，而不是0，9
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static String changeLuoMa(char num) {
        String str;
        switch (num) {
            case '0' -> str = "";
            case '1' -> str = "I";
            case '2' -> str = "II";
            case '3' -> str = "III";
            case '4' -> str = "IV";
            case '5' -> str = "V";
            case '6' -> str = "VI";
            case '7' -> str = "VII";
            case '8' -> str = "VIII";
            case '9' -> str = "IX";
            default -> str = "";
        }
        return str;
    }

}