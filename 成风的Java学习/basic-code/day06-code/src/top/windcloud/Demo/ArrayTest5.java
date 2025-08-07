import java.util.Random;

public class ArrayTest5 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0 ; i < arr.length ; i++) {
            int num = r.nextInt(100) + 1;
            arr[i] = num;
            sum = sum + arr[i];
        }
        System.out.println("和" + sum);
        System.out.println("平均数" + sum / arr.length);

        int count = 0;
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] < sum / arr.length) {
                count++;
            }
        }
        System.out.println("共" + count + "个数小于平均数");

        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");//print就不会换行了
        }
    }
}
