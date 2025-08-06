import java.util.Scanner;

public class ifDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入酒量");
        int jiu = sc.nextInt();
        if (jiu  > 2){
            System.out.println("小伙子，可以啊");
        }
        else {
            System.out.println("菜就多练");
        }
    }
}
