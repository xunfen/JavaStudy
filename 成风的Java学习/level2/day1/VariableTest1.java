public class VariableTest1 {
    public static void main(String[] args) {
        /*打印老师信息
        *姓名：黑马谢广坤->5个char（bushi),string
        *年龄：18->int
        *性别：男->char
        *身高：180.1->double
        *是否单身：是->boolean:true
        */
        //姓名
        String name = "黑马谢广坤";
        System.out.println("姓名：" + name);
        //年龄
        int age = 18;
        System.out.println("年龄：" + age);
        //性别
        char gender = '男';
        System.out.println("性别：" + gender);
        //身高
        double height = 180.1;
        System.out.println("身高：" + height);
        //单身
        boolean flag = true;
        System.out.println("是否单身：" + flag);
    }
}