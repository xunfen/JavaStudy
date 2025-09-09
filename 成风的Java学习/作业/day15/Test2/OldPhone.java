package Test2;

public class OldPhone extends Phone {
    @Override
    public  void Call() {
        System.out.println("旧手机上转转");
    }
    
    @Override
    public void SendMessage() {
        System.out.println("旧手机上发短信");
    }
    
}