public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "Abc";
        System.out.println(s1 == s2);
        //==:基本数据类型比较数据值
        //   引用数据类型比较地址值

        boolean result = s1.equals(s2);
        System.out.println(result);//equals要完全一样 包括字母大小写

        boolean result2 = s1.equalsIgnoreCase(s2);
        System.out.println(result2);//equalsIgnoreCase则忽略大小写

        
    }
    
}
