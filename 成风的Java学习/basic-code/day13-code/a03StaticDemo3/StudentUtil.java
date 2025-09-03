package a03StaticDemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {
    }

    public static int getMaxAgeStudent(ArrayList<Student> list) {
        int max = list.get(0).getAge();

        for (int i = 1; i < list.size(); i++) {
            // 索引list.get(i)得到的元素是学生对象，还需要getAge才能拿到这个对象的age
            int tempAge = list.get(i).getAge();
            if (tempAge > max) {
                max = tempAge;
            }

        }
        return max;
    }
}