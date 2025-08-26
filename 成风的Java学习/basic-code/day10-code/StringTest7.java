public class StringTest7 {
    public static void main(String[] args) {
        String id = "341022200704241333";

        //获取出生年月日
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);
        System.out.println("出生年月日：" + year + "年" + month + "月" + day + "日");

        //获取性别
        //String gender = id.substring(16,17);
        char gender = id.charAt(16);//得到的是字符型的，要转成整数型
        /*用ASCII码表转换
        ‘0’-》48
        ‘1’-》49
        ...
        '9'-》57
        差48个
        */
        int num = gender - 48;
        //System.out.println(num);
        if (num % 2 == 0) {
            System.out.println("性别：女");
        } else {
            System.out.println("性别：男");
        }
    }
    
}
