package Test3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        /* 有如下员工信息：

        ~~~java
            姓名：张三，工资：3000
            姓名：李四，工资：3500
            姓名：王五，工资：4000
            姓名：赵六，工资：4500
            姓名：田七，工资：5000
        ~~~

        先需要将所有的员工信息都存入ArrayList集合中，并完成如下操作：
        1、判断是否有姓名为“王五”的员工，如果有，改名为“王小五”
        2、判断是否有姓名为“赵六”的员工，如果有，将其删除
        3、给姓名为“田七”的员工，涨500工资 */

        ArrayList<Employee> list = new ArrayList();
        Employee e1 = new Employee("张三", 3000);
        Employee e2 = new Employee("李四", 3500);
        Employee e3 = new Employee("王五", 4000);
        Employee e4 = new Employee("赵六", 4500);
        Employee e5 = new Employee("田七", 5000);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        /* for (int i = 0; i < list.size(); i++) {
            Employee e = list.get(i);
            System.out.println(e.getName() + e.getWage());
        } */

        for (int i = 0; i < list.size(); i++) {
            Employee e = list.get(i);
            if (e.getName().equals("王五")) {
                e.setName("王小五");
                //System.out.println(e.getName() + e.getWage());
            }
            if (e.getName().equals("赵六")) {
                list.remove(e);
                i--;//删除之后size还是原来的大小，所以要jia减i，让i重新指向新的位置
            }
            if (e.getName().equals("田七")) {
                int wage = e.getWage() + 500;
                e.setWage(wage);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            Employee e = list.get(i);
            System.out.println(e.getName() + e.getWage());
        }
    }
}