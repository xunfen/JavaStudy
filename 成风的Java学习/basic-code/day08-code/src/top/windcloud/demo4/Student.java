package top.windcloud.demo4;

public class Student {
    private String name;
    private int age;

    //虚拟机加的空参构造
    public Student() {
        System.out.println("看看我执行了吗");
    }

    //有参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}