package Test2;

public class Test{
    public static void main(String[] args) {
        PingPongSporter pps = new PingPongSporter("张三", 18);
        System.out.println(pps.getName() + " " + pps.getAge());
        pps.study();
        pps.speakEnglish();
    }
}