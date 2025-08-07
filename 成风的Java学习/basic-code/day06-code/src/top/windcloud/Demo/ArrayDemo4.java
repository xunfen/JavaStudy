public class ArrayDemo4 {
    public static void main(String[] args) {
        String[] arr = new String[3];
        arr[0] = "zhangsan";
        arr[1] = "lisi";

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);//arr[2]没有写入给出的是虚拟内存给出的初始化值
        //int  默认初始化值0
        //double 默认初始化值0.0
        //char字符类型 默认初始化值\u0000（空格）
        //boolean 默认初始化值false
        //String（引用数据类型) 默认初始化值null

    }
}
