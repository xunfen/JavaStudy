package Test2;

public class Test {
    public static void main(String[] args) {
        Lecturer l = new Lecturer();
        l.setId("001");
        l.setName("张三");
        System.out.println(l.getId() + " " + l.getName());
        l.work();
        System.out.println("==================================");

        Tutor t = new Tutor("002", "李四");
        System.out.println(t.getId() + " " + t.getName());
        t.work();
        System.out.println("==================================");

        Maintainer m = new Maintainer();
        m.setId("003");
        m.setName("王五");
        System.out.println(m.getId() + " " + m.getName());
        m.work();
        System.out.println("==================================");

        Buyer b = new Buyer("004", "赵六");
        System.out.println(b.getId() + " " + b.getName());
        b.work();
    }
}