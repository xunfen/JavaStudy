public class ValueDemo2{
    public static void main(String[] args){
        ///制表符的用法
        //制表符’\t‘，把前面字符串长度补齐到8或者8的倍数，最多补8个空格，让数据对其
        System.out.println("abc" + '\t' + "def");//补5个
        System.out.println("abcd" + '\t' + "ef");//补4个

        System.out.println("-------分割线-------");
        System.out.println("name" + "age");//拼接name 与 age，变成nameage
        System.out.println("tom" + "25");
        System.out.println("tim" + "21");
        System.out.println("mike" + "36");

        //以下为制表符示例
        System.out.println("-------分割线-------");
        System.out.println("name" + '\t' + "age");
        System.out.println("tom" + '\t' + "25");
        System.out.println("tim" + '\t' + "21");
        System.out.println("mike" + '\t' + "36");

    }
}