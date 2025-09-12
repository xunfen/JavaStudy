public class checkcase1 {
    public static void main(String[] args) {
        String qq = "126634";
        /* boolean flag = check(qq);
        System.out.println(flag); */
        //正则表达式
        System.out.println(qq.matches("[1-9]\\d{5,19}"));


    }

    //常规方法
    public static boolean check(String qq) {
        if ((qq.length() < 6 ) || (qq.length() > 20) || (qq.charAt(0) == '0')) {
            return false;
        }
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if ( !(c >= '0' && c <= '9') ) {
                return false;
            }
        }
        return true;
    }
    
}
