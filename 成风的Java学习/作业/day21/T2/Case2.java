public class Case2 {
    public static void main(String[] args) {
        int Sum = getSum(12);
        System.out.println(Sum);
    }

    public static int getSum(int month) {
        if (month == 1 || month == 2) {
            return 1;
        }
        return getSum(month - 1) + getSum(month - 2);
    }
    
}
