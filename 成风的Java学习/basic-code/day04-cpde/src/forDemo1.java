public class forDemo1 {
    public static void main(String[] args) {
        for (int i = 1;i <= 10;i++) {               //1.初始化语句，2.条件判断语句，执行判断结果为true还是false，若为false，循环结束，3.条件控制语句，4.回调到2
            System.out.println("hello world");    //初始化语句只执行一次
            System.out.println(i);
        }
    }
}