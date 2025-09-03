package a01StaticDemo1;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(18);
        s1.setGender("man");
        //s1.teacherName = "awei";
        Student.teacherName = "awei";

        s1.study();
        s1.show();

        Student s2 = new Student();
        s2.setName("王五");
        s2.setAge(19);
        s2.setGender("woman");

        s2.study();
        s2.show();
    }
}