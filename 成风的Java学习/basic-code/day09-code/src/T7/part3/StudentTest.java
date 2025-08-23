package T7;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student stu1 = new Student(1, "张三", 23);
        Student stu2 = new Student(2, "李四", 24);
        Student stu3 = new Student(3,"王五",25);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //要求5：查询id为2的学生，如果存在，则将他的年龄+1
        


    }
}