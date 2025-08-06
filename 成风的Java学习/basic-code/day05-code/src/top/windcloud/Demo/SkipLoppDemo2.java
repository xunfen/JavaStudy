public class SkipLoppDemo2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
             break;//结束整个循环   
            }
            System.out.println("小脑斧在吃" + i + "个包子");//如果放在if上，则先吃再判断
        }
    }
    
}
