import java.util.Scanner;

public class StringTest6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入金额:");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("输入金额有误");
            }
        }

        String moneyStr = "";

        //得到money中的每一位数字
        while (true) {
            int ge = money % 10;
            //System.out.print(sgetCapitalNumber(ge));
            moneyStr = sgetCapitalNumber(ge) + moneyStr;//顺序注意不要写反！
            money = money / 10;
            if (money == 0) {
                break;
            }
        }
        //System.out.println(moneyStr);
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        System.out.println(moneyStr);

        //插入单位
        String result = "";
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        for(int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];
        }
        System.out.println(result);

    }

    public static String sgetCapitalNumber(int number) {
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];

    }
    
}
