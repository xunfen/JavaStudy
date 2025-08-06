public class VariableDemo2{
    //主入口
    public static void main(String[] args){
        //定义变量
        //数据类型 变量名 = 数据值；
        int a = 10;
        int b = 25;
        System.out.println(a);
        System.out.println(b);
        //int a = 20；
        //变量名不可重复
        System.out.println(a + b);//变量参与计算
        
        //修改变量值
        a = 30;
        System.out.println(a);

        //一行定义多个变量
        int c = 10, d = 20, e =30;
        System.out.println("c=" + c + '\n' + "d=" + d + '\n' + "e=" + e);
    }
}