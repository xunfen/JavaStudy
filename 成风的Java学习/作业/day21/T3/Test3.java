public class Test3 {
    public static void main(String[] args) {
        int count = getCount(1);
        System.out.println(count);
    }

    public static int getCount(int day) {
        if (day <= 0 || day >= 11) {
            System.out.println("输入的日期有误");
            return 0;
        }

        if (day == 10) {
            return 1;
        }

        return (getCount(day + 1) + 1) * 2;
    }
    
}
