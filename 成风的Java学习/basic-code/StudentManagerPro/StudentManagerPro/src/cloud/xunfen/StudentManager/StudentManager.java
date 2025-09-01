package cloud.xunfen.StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        loop: while (true) {
            System.out.println("-------------欢迎来到黑马学生管理系统----------------");
            System.out.println("1. 添加学生");
            System.out.println("2. 删除学生");
            System.out.println("3. 修改学生");
            System.out.println("4. 查询学生");
            System.out.println("5. 退出系统");
            System.out.println("====================================================");
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);

            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出系统");
                    break loop;
                    //System.exit(0);//停止虚拟机运行
            }
                default -> System.out.println("请输入正确的选项！");
            }
        }
    }

    //添加学生
    public static void addStudent(ArrayList<Student> list) {
        //System.out.println("添加学生");
        Student s = new Student();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入学生id");
            String id = sc.next();
            boolean flag = contains(list, id);
            if (flag) {
                System.out.println("该id已存在！");

            } else {
                s.setId(id);
                break;
            }
        }

        System.out.println("请输入学生姓名");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生地址");
        String address = sc.next();
        s.setAddress(address);

        list.add(s);
        System.out.println("添加成功");

        //Student s = new Student(String id, String name, int age, String address);
    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        //System.out.println("删除学生");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的学号：");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index >= 0) {
            list.remove(index);
            System.out.println("删除成功");
        } else {
            System.out.println("没有此学生,删除失败！");
            return;
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list) {
        //System.out.println("修改学生");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改学生的学号：");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index == -1) { 
            System.out.println("没有此学生,请重新输入！");
            return;
        }

        Student stu = list.get(index);

        System.out.println("请输入要修改的姓名：");
        String newName = sc.next();
        stu.setName(newName);

        System.out.println("请输入要修改的年龄：");
        int newAge = sc.nextInt();
        stu.setAge(newAge);

        System.out.println("请输入要修改的家庭住址：");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

        System.out.println("修改成功！");
    }

    //查询学生
    public static void queryStudent(ArrayList<Student> list) {
        //System.out.println("查询学生");
        if (list.size() == 0) {
            System.out.println("当前列表没有学生信息，请添加后查询！");
            return;
        }
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }
    
    //判断id是否存在
    public static boolean contains(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    //通过id返回索引
    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if(sid.equals(id)) {
                return i;
            }
        }
        return -1;
    }
    
}
