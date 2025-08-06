public class VariableDemo {
    public static void main(String[] args) {
        //整数类型
        //byte[-128~+127]
        byte b = 10;
        System.out.println(b);
        //short
        short s = 20;
        System.out.println(s);
        //int
        int i = 30;
        System.out.println(i);
        //long
        //如果要定义long变量，需在数据值后加上“L”或“l“
        //报错long n = 9999999999
        long n = 9999999999L;
        System.out.println(n);

        //小数类型
        //float
        //float定义时要用F后缀
        float f = 10.7F;
        System.out.println(f);
        //double
        double d = 20.2;
        System.out.println(d);

        //char
        char c = '中';
        System.out.println(c);

        //boolean
        //布尔值只有true与false
        boolean o = true;
        System.out.println(o);
    }
}
