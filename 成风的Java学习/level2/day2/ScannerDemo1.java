//1.导包--找到Scanner这个包在哪
//注意：要写在类定义（public class...）的上面
import java.util.Scanner;

public class ScannerDemo1 {
public static void main(String[] args) {
    //2.创建对象--表示准备用Scanner这个类
    Scanner sc = new Scanner(System.in);

    System.out.println("请输入整数：");
    //3.接收数据
    int i = sc.nextInt();
    //变量i记录了键盘录入的数据

    System.out.println(i);
}
    
}
