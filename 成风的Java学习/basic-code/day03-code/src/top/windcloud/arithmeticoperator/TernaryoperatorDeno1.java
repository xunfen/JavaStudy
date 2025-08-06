public class TernaryoperatorDeno1 {
    public static void main(String[] args) {
        //使用三元运算符，获取两个数中的最大值
        //格式：关系表达式 ? 表达式1 : 表达式2
        //如果关系表达式为true，则返回表达式1的值，否则返回表达式2的值
        int num1 = 10;
        int num2 = 20;
        int max = num1 > num2 ? num1 : num2;
        //三元表达式的值必须被使用，要么输出，要么赋值，否则报错
        System.out.println("最大值是: " + max);
    }
}