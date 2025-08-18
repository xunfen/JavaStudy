import java.util.Scanner;

public class Test6Part {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        int[] arr = new int[count];
        int index = arr.length - 1;
        while (temp != 0) {
            int ge = temp % 10;
            temp = temp / 10;
            arr[index] = ge;
            index--;
        }
    }
}