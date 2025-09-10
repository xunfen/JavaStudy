package Test3;


public class NewPhone extends Phone implements Play {
    @Override
    public void Call() {
        System.out.println("新手机在打电话。。。");
    }

    @Override
    public void SendMessage() {
        System.out.println("新手机在发短信。。。");
    }

    @Override
    public void playGame() {
        System.out.println("新手机在玩游戏。。。");
    }
}