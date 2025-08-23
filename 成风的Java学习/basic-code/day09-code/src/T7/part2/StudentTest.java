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


        //要求3：通过id删除学生信息
        //如果存在则删除，如果不存在，则提示删除失败
        //要求4；删除完毕遍历所有学生的信息
        /* int i = getIndex(arr, 2);
        System.out.println(i); */
        int index = getIndex(arr, 2);
        if (index >= 0) {
            arr[index] = null;
            printArr(arr);
        } else {
            System.out.println("删除失败");
        }



    }

    //找到id在数组中的索引
    public static int getIndex(Student[] arr , int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu !=null) {
                int sid = stu.getId();
                if (sid == id) {
                    return i;
                }
            }
        }
        //循环结束，没有找到,表示不存在
        return -1;

    }


    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println(arr[i].getId() + ", " + arr[i].getName() + ", " + arr[i].getAge());
            }
        }
    }
}