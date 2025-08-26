import java.util.Scanner;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        //链式编程：当我们在调用一个方法时，不需要用变量接受他的结果，可以继续调用他的结果,左值右引
        int len = getString().substring(1).replace("A","B").length();
        System.out.println(len);
    }

    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();
        return str;
    }
    
}
