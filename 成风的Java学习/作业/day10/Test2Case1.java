public class Test2Case1 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "cdeab";

        //String rotate = rotate(strA);
        //System.out.println(rotate);
        boolean result = check(strA,strB);
        System.out.println(result);
    }

    //旋转字符串:把左侧的字符串移动到右侧
    public static String rotate(String str) {
        //字符串是不能修改地
        //以后看到修改字符串的内容：
        //1.用substring截取，把左边的字符截取出来拼接到右侧
        //2.把字符串变成字符数组，调整字符数组的位置
        //此处使用法一

        char first = str.charAt(0);
        String end = str.substring(1);

        return end + first;
    }

    public static boolean check(String strA, String strB) {
        for(int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if(strA.equals(strB)) {
                return true;
            }
        }
        return false;
    }
    
}
