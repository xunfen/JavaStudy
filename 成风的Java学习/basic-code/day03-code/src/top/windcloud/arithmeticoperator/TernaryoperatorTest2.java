public class TernaryoperatorTest2 {
    public static void main(String[] args) {
        int a = 150;
        int b = 210;
        int c = 165;
        //三元运算符比较三变量大小
        //int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        //或者找一个临时变量
        int temp = a > b  ? a : b;
        int max = temp > c ? temp : c;
        System.out.println(max);
    }
}