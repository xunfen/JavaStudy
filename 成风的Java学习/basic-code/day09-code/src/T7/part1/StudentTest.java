package T7;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student stu1 = new Student(1, "张三", 23);
        Student stu2 = new Student(2, "李四", 24);
        // Student stu3 = new Student(3,"王五",25);

        arr[0] = stu1;
        arr[1] = stu2;
        // arr[2] = stu3;

        // 要求1：再次添加一个学生对象，并在添加时对学号唯一性进行判断
        // 要求2：遍历数组，并输出所有学生信息
        Student stu4 = new Student(4, "赵六", 26);
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            System.out.println("学号已存在！");
        } else {
            // 学号不存在，考虑数组有没有存满,存了几个
            int count = getCount(arr);
            if (count == arr.length) {
                // 数组已存满
                // 创建一个新数组，长度为原数组长度+1
                Student[] newArr = creatNewArr(arr);
                newArr[count] = stu4;
                printArr(newArr);
            } else {
                // 数组没存满
                arr[count] = stu4;
                printArr(arr);
            }
        }

    }

    // 新建一个方法，判断学号是否唯一
    public static boolean contains(Student arr[], int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getId() == id) {
                    return true;
                }
            }

        }
        return false;
    }

    // 判断数组有没有存满
    public static int getCount(Student arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    // 创建数组
    public static Student[] creatNewArr(Student arr[]) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    // 打印学生信息
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println(arr[i].getId() + ", " + arr[i].getName() + ", " + arr[i].getAge());
            }
        }
    }
}