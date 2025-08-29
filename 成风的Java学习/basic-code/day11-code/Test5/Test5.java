import java.util.ArrayList;
import java.util.Scanner;

import Test4.Student;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("请输入第" + (i + 1) + "个学生的姓名：");
            String name = sc.next();
            s.setName(name);
            System.out.println("请输入第" + (i + 1) + "个学生的年龄：");
            int age = sc.nextInt();
            s.setAge(age);

            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "---" + stu.getAge());
        }
        
    }
    
}
