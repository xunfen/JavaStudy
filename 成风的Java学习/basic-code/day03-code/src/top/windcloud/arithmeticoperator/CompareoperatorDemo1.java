public class CompareoperatorDemo1 {
    public static void main(String[] args) {
        //关系运算符：==，！=，>，<，>=，<=，判断俩边的值是否满足关系运算符
        //成立返回true，不成立返回false
        //注意：关系运算符的结果是boolean类型

        //1.== 判断左右俩边的值是否相等
        int a =10;
        int b = 20;
        int c = 10;
        System.out.println(a == b);
        System.out.println(a == c);

        //2.!= 判断左右俩边的值是否不相等
        System.out.println(a != b);
        System.out.println(a != c);
    }
}