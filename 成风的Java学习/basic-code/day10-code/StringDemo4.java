public class StringDemo4 {
    public static void main(String[] args) {
        String phoneNumber = "13112349468";

        //截取手机号码前三位
        String start = phoneNumber.substring(0,3);//substring包头不包尾 包左不包右，所以3就要截取到索引4
        //System.out.println(start);

        //截取手机号码后四位
        String end = phoneNumber.substring(7);//一个数字代表从索引【7】开始截取到字符串末尾
        //System.out.println(end);

        String result = start + "****" + end;
        System.out.println(result);
    }
    
}
