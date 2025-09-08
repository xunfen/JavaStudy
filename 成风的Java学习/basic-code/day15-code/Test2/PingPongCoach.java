package Test2;

public class PingPongCoach extends Coach implements English{
    public PingPongCoach(){

    }

    public PingPongCoach(String name, int age){
        super(name, age);
    }

    @Override
    public void teach(){
        System.out.println("乒乓球教练在教乒乓球");
    }

    @Override
    public void speakEnglish(){
        System.out.println("乒乓球教练在说英语");
    }
}