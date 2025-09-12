public class RegexTest1 {
    public static void main(String[] args) {
        String phone = "18156895321";
        String regex1 = "1[3-9]\\d{9}";
        boolean flag1 = phone.matches(regex1);
        System.out.println(flag1);
        System.out.println("==================");
        String phone2 = "020-2324242";
        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        boolean flag2 = phone2.matches(regex2);
        System.out.println(flag2);
        System.out.println("==================");
        String email = "abc@qq.com";
        String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        boolean flag3 = email.matches(regex3);
        System.out.println(flag3);
    }
    
}
