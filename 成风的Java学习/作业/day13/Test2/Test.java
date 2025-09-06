package Test2;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);
        s.setClassTable("JavaEE");
        //System.out.println(s.getName() + " " + s.getAge() + " " + s.getClassTable());
        s.check();
        s.fillForm();

        Teacher t = new Teacher("李四", 19, "Lecturer");
        t.check();
        t.publicForm();
    }
}