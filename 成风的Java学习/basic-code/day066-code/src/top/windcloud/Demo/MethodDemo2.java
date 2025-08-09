public class MethodDemo2 {
    public static void main(String[] args) {
        getSum(10,20);//实参

        int a = 10;
        int b = 10;
        getSum(a,b);//实参
    }

    public static void getSum(int a, int b) {  //形参                         //参数的数量与类型要一一对应，即实参与形参要一一对应，否则报错
        int result = a + b;
        System.out.println(result);
    }
    
}
