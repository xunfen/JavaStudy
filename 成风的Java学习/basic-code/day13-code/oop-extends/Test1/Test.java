package Test1;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("id01", "name01", 1000, 80);
        System.out.println(m.getId() + " " + m.getName() + " " + m.getSalary() + " " + m.getBonus());

        m.work();
        m.eat();

        Cooker c = new Cooker();
        c.setId("id02");
        c.setName("name02");
        c.setSalary(10000);
        System.out.println(c.getId() + " " + c.getName() + " " + c.getSalary());
        c.work();
        c.eat();

    }
}