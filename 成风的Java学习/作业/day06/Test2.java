public class Test2 {
    public static void main(String[] args) {
        //定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
        System.out.println(getMax(3,17,10));
    }

    public static int getMax(int num1,int num2,int num3) {
        int temp = num1 > num2 ? num1 : num2;
        int max = temp > num3 ? temp : num3;
        return max;

    }

}