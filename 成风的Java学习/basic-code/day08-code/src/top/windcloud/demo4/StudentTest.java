package top.windcloud.demo4;

public class StudentTest {
    public static void main(String[] args) {

        //空参构造
        //小括号里面什么都不写，调用的是空参构造，虚拟机会加一个空参构造方法，见Student.java H7-H10
        //Student s = new Student();

        //有参构造
        Student s = new Student("小王", 18);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}