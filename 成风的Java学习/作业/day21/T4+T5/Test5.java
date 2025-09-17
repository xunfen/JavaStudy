public class Test5 {
    // 答案是12145
    public static void main(String[] args) {
        int count = getCount(20);
        System.out.println(count);
    }

    public static int getCount(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        if (n == 3) {
            return 4;
        }

        return getCount(n -1) + getCount(n - 2) + getCount(n - 3);
    }
}
