import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        //我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。
        //请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
        //规则为：号码为18位0k，不能以数字0开头0k，前17位只可以是数字0k，最后一位可以是数字或者大写字母X。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号码：");
        String id = sc.nextLine();
        boolean result = isValid(id);
        if (result) {
            System.out.println("身份证号码合法！");
        } else {
            System.out.println("身份证号码不合法！");
        }
    }
    
    public static boolean isValid(String id) {
        if (id.length() != 18) {
            return false;
        }

        if (id.charAt(0) == '0') {
            return false;
        }

        for (int i = 0; i < 17; i++) {
            char c = id.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        char end = id.charAt(17);
        if ((end < '0' || end > '9') && (end != 'X')) {
            return false;
        }

        return true;
    }

}
