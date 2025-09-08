package Test2;

public class PingPongSporter extends Sporter implements English {

    public PingPongSporter() {

    }

    public PingPongSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        // TODO Auto-generated method stub
        System.out.println("乒乓球运动员在学习如何打乒乓球");
        
    }

    @Override
    public void speakEnglish() {
        // TODO Auto-generated method stub
        System.out.println("乒乓球运动员在说英语");
        
    }
    
}