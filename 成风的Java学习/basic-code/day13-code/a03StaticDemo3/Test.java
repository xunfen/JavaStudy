package a03StaticDemo3;

import java.util.ArrayList;


public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三", 18, "man");
        Student stu2 = new Student("李四", 19, "woman");
        Student stu3 = new Student("王五", 20, "man");

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int maxAgeStudent = StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxAgeStudent);
    }
}