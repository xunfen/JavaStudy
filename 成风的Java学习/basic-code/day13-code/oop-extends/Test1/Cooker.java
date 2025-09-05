package Test1;

public class Cooker extends Employee {

    public Cooker() {

    }


    public Cooker(String id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("厨师正在炒菜");
    }
}