package Test2;

public class Student extends Person {
    private String classTable;

    public Student () {

    }
    public Student (String name, int age, String classTable) {
        super(name, age);
        this.classTable = classTable;
    }

    public String getClassTable () {
        return classTable;
    }

    public void setClassTable (String classTable) {
        this.classTable = classTable;
    }

    public void fillForm() {
        System.out.println("学生正在写听课反馈");
    }
}