import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        //有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。再通过键盘录入一个整数数字。要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int num  = sc.nextInt();
        int index = 0;

        int[] arr = {12,14,23,45,66,68,70,77,90,91};
        int[] brr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= num) {
                brr[i] = arr[i];
                index = i + 1;
            } else {
                brr[i+1] = arr[i];
            }
            
        }
        brr[index] = num;
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
    
}
