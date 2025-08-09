public class MethodDemo1 {
    public static void main(String[] args) {
        playGame();
        playGame();
    }
    //方法要写在main的外面，类的里面
    public static void playGame() {
        System.out.println("选人物");
        System.out.println("准备开局");
        System.out.println("对线");
        System.out.println("崩盘");
        System.out.println("骂队友");
        System.out.println("送人头");
        System.out.println("GG");
        
    }
    
}
