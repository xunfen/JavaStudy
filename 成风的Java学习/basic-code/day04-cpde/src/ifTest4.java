import java.util.Scanner;

public class ifTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入票号：");
        int ticket =sc.nextInt();
        if (ticket<1 | ticket > 100) {
            System.out.println("假票");
        }
        else {if (ticket % 2 == 0) {//%2==1则为奇数
            System.out.println("right");
        }
        else {
            System.out.println("left");
        }
    }
        
    }
}