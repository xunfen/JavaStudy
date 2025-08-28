public class Test5 {
    public static void main(String[] args) {
        String num1 = "12";
        String num2 = "11";

        //把num1和num2转换成int类型
        //先遍历字符串 依次得到每个字符
        //再把字符变成对应的数字
        char[] num1Arr = num1.toCharArray();
        char[] num2Arr = num2.toCharArray();

        int numA = 0;
        for (int i = 0; i < num1Arr.length; i++) {
            numA = numA * 10 + (num1Arr[i] - '0');
        }

        int numB = 0;
        for (int i = 0; i < num2Arr.length; i++) {
            numB = numB * 10 + (num2Arr[i] - '0');
        }

        int product = numA * numB;

        String productStr = product + "";

        System.out.println(productStr);

    }
}
