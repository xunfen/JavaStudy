public class MethodDemo3 {
    public static void main(String[] args) {
        //直接调用,一般用于无返回值的方法中
        //getSum(10, 20, 30);

        //赋值调用
        int sum1 = getSum(10, 20, 30);
        int sum2 = getSum(20, 30, 40);
        int sum3 = getSum(30, 40, 50);
        int sum4 = getSum(40, 50, 60);
        int sum = sum1 + sum2 + sum3 + sum4;
        System.out.println(sum);

        //输出调用
        //System.out.println(sum(10, 20, 30));
    }

    public static int getSum(int num1, int num2, int num3) {
        int resule = num1 + num2 + num3;
        return resule;
    } 
    
}
