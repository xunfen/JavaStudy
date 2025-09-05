package Test2;

public class Tutor extends Teacher {
    public Tutor() {

    }

    public Tutor (String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("助教正在助教");
    }
}