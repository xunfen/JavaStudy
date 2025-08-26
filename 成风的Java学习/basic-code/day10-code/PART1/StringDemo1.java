public class StringDemo1 {
    public static void main(String[] args) {
        // 使用直接赋值
        String s1 = "abc";
        System.out.println(s1);

        // 使用new方式获取
        // 空参构造，获取一个空白字符串对象
        String s2 = new String();
        System.out.println("@" + s2 + "!");

        // 有参构造，根据传递的字符串内容，创建字符串对象（脱裤子放屁）
        String s3 = new String("abc");
        System.out.println(s3);

        // 传递一个字符数组，根据字符数组创建字符串对象
        char[] chs = { 'a', 'b', 'e' };
        String s4 = new String(chs);
        System.out.println(s4);
        // 字符串内容创建以后不可修改，但是可以变成一个字符数据，在修改字符数组

        // 传递字节数组，根据字节数组创建字符串对象
        byte[] bytes = { 97, 98, 99 };
        String s5 = new String(bytes);
        System.out.println(s5);// 拿着97 98 99 去查ASCII表，查到对于字母在返回相应的字母

    }

}
