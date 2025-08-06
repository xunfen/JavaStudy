public class ValueDemo1{
    public static void main(String[] args){
        //整数
        System.out.println(666);
        System.out.println(-777);

        //小数
        System.out.println(-1.88);

        //字符串
        System.out.println("xunfen250");
        System.out.println("寻风250");

        //字符
        System.out.println('男');

        //布尔
        System.out.println(true);
        System.out.println(false);

        //空
        //null不可直接打印，只能用字符串打印
        //System.out.println(null);
        System.out.println("null");

        //制表符’\t‘，把前面字符串长度补齐到8或者8的倍数，最多补8个空格，让数据对其
        System.out.println("abc" + '\t' + "def");//补5个
        System.out.println("abcd" + '\t' + "ef");//补4个

    }
}