public class Test8 {
    public static void main(String[] args) {
        //请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。例如："abcba"、"上海自来水来自海上"均为对称字符串。
        String str = "上海自来水来自海上";
        System.out.println(isSymmetry(str));

    }

    public static boolean isSymmetry(String str) {
        char[] c = str.toCharArray();
        for (int i = 0, j = c.length - 1; i <= j; i++, j--) {
            if (c[i] != c[j]) {
                return false;
            }
        }
        return true;
    }
    
}
