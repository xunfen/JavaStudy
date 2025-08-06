public class forTest4 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 1000000; i++) {
            sum = sum + i;//sum += i;               //sum仅在大括号内定义，仅于大括号内有效
            System.out.println(sum);
        }
    }
}