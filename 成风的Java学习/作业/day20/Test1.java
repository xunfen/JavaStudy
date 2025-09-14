import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入一个整数");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);
            if (num < 1 || num > 100) {
                System.out.println("输入的数字不在范围内");
                continue;
            }
            list.add(num);
            //集合中的是Integer,Scanner获取的是int,触发了自动装箱

           int sum = getSum(list);
           if (sum > 200) {
            System.out.println("和已超过200");
            break;
           }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    private static int getSum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
    
}
