import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        System.out.println("请输入星期数：");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        
        /*if (day >= 1 & day <=5) {
            System.out.println("工作日");
        }
        else if (day ==6 | day == 7){
            System.out.println("休息日");
        }
        else {
            System.out.println("输入错误");
        }*/

        switch (day) {
            case 1,2,3,4,5 ->  System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("输入错误");
        }
    
    } 
}