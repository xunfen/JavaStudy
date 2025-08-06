public class Main {
    public static void main(String[] args) {
        //先用后加
        int a = 10;
        int b = a++;//先把 a 的值赋给 b，然后 a 自增
        System.out.println("a = " + a); // 输出 11
        System.out.println("b = " + b); // 输出 10  

        //先加后用
        int c = 10;
        int d = ++c;//先自增 c 的值，然后再赋给 d
        System.out.println("c = " + c); // 输出 11
        System.out.println("d = " + d); // 输出 11
    }
}   