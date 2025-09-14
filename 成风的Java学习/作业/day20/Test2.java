public class Test2 {
    public static void main(String[] args) {
        String str = "123456789";
        if(!(str.matches("[1-9]\\d{0,9}"))) {
            System.out.println("数据格式有误");
        } else {
            System.out.println("数据格式正确");
            int num = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                num = num * 10 + (c - '0');
            }
            System.out.println(num);
        }
    }
    
}
