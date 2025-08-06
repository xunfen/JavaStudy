package top.windcloud.arithmeticoperator;

public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        //+
        System.out.println(3 + 2);

        //-
        System.out.println(5 - 1);

        //*
        System.out.println(7 * 9);

        //如果在计算时有小数参与
        System.out.println(1.1 + 1.01);
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);
        System.out.println(1.1 / 1.01);
        //结论：在代码中，如果有小数参与计算，结果可能会有误差。（比如1.1+1.1可能无误差）

        // /
        System.out.println(10 / 2);
        System.out.println(10 / 3);//整数除法，结果为整数，余数被舍弃
        System.out.println(10.0 / 3);//如果有小数参与，结果为小数

        // %取模（取余）
        System.out.println(10 % 2);
        System.out.println(10 % 3);
    }
}
