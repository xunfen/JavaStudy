public class another {
    public static void main(String[] args) {
        //System.out.printf("Hello,world");
        //第一部分参数：要输出的内容%s，占位符
        //第二部分参数：填充的数据
        System.out.printf("你好啊%s","张三");//你好啊张三
        System.out.println();
        System.out.printf("%s你好啊%s","张三","李四");//张三你好啊李四
        //有几个%s就有几个填充的数据
        //printf只能输出不能换行，除非俩句中间写一个System.out.println();
        printf("123");
    }
}