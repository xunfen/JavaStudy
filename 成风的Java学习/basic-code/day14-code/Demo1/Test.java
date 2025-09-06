package Demo1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("王五");
        t.setAge(28);

        Administrator admin = new Administrator();
        admin.setName("赵六");
        admin.setAge(38);


        register(s);
        register(t);
        register(admin);
    }

    public static void register(Person p) {
        p.show();
    }
}