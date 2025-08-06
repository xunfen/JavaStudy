import java.util.Scanner;

public class TernaryoperatorTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重：");   
        int tiger1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重：");
        int tiger2 = sc.nextInt();
        /*boolean result = tiger1 == tiger2;
        System.out.println(result);
        结果只有true与false两种情况，but，现在我要看到结果为相同/不相同
        故使用三元运算符进行判断
        */
       //System.out.println(tiger1 == tiger2 ? "相同" : "不相同");
       //或者：
       String result = tiger1 == tiger2 ? "相同" : "不相同";
       System.out.println(result);
    }
}