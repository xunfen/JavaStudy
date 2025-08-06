import javax.sql.rowset.spi.SyncResolver;

public class ArithmeticoperatorDemo2   {
    public static void main(String[] args) {
        //+=
        int a = 10;
        int b = 20;
        a += b;//a先加上b的值，然后再赋值给a，b的值不变
        //等同于a = (int) (a + b);
        System.out.println(a);
        System.out.println(b);

        //-=
        int c = 10;
        int d = 20;
        c -= d;//c先减去d的值，然后再赋值给c，d的值不变
        //等同于c = (int) (c - d);
        System.out.println(c);
        System.out.println(d);

        //一个细节
        short s = 1;
        s += 1; //s先加上1，然后再赋值给s，s的类型仍然是short
        System.out.println(s);
        /*隐式转换：byte、short、char类型
        但是short类型的s怎么会赋值一个int类型的值呢？
        因为+=，-=，*=，/=，%=底层有一个强制类型转换
        所以，s += 1等同于s = (short) (s + 1)
        */

        /*+=,-=,*=,/=,%=原理一致
         * +=：先将右边的值与左边的值相加，然后将结果赋值给左边的变量
         * -=：先将右边的值从左边的值中减去，然后将结果赋值给左边的变量
         * *=：先将右边的值与左边的值相乘，然后将结果赋值给左边的变量
         * /=：先将左边的值除以右边的值，然后将结果赋值给左边的变量
         * %=：先将左边的值对右边的值取模，然后将结果赋值给左边的变量
        */
    }
}