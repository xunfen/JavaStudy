public class Test1 {
    public static void main(String[] args) {
        //定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
        getMin(11.2,2.2);
    }

    public static void getMin(double num1,double num2) {
        if (num1 < num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }


    
}
