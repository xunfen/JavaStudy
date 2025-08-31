import java.util.ArrayList;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        /* 利用面向对象的思想设计一个图书管理系统。图书的属性有：编号，书名，作者，价格。要求提供如下功能：
        1、提供操作菜单，可以选择要进行的操作。
        2、可以添加图书，添加图书时，编号需要唯一，添加成功，返回到菜单。ok
        3、可以查询图书，显示所有图书信息，然后返回到菜单。ok
        4、可以根据书名，查询单本图书信息，显示信息后，返回到菜单。ok
        5、可以删除图书，通过编号删除，删除成功后，返回到菜单。
        6、可以修改图书的信息，但编号不可以修改，修改成功后，返回到菜单。
        7、可以退出系统，结束程序运行。
        提示：
        1、所有图书信息由键盘录入
        2、图书的价格可以定义为字符串类型，因为在键盘录入时，不可以先使用nextInt()方法获取整数然后再使用next()方法获取字符串，这样会导致next()方法获取不到数据。 */
        ArrayList<Book> list = new ArrayList<>();

        while (true) {
            System.out.println("欢迎来到图书管理系统");
            System.out.println("1. 添加图书");//ok
            System.out.println("2. 删除图书");//ok
            System.out.println("3. 修改图书");//the lase
            System.out.println("4. 遍历系统");//ok
            System.out.println("5. 查询图书");//pk
            System.out.println("6. 退出");//ok
            System.out.println("======================");
            System.out.println("请输入功能编号");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> add(list);
                case "2" -> delete(list);
                case "3" -> update(list);
                case "4" -> query(list);
                case "5" -> find(list);
                case "6" -> System.exit(0);
                default -> System.out.println("输入错误！,请重新输入");
            }
        }
        
    }

    //添加
    public static void add(ArrayList<Book> list) { 
        //System.out.println("add");
        Book b = new Book();
        Scanner sc = new Scanner(System.in);
        while(true) {
        System.out.println("请输入ID");
        String id = sc.next();
        boolean flag = contains(list, id);
            if (flag) {
                System.out.println("该ID已存在！");
            } else {
                b.setId(id);
                break;
            }
        }
        

        System.out.println("请输入书名");
        b.setName(sc.next());
        System.out.println("请输入作者");
        b.setAuthor(sc.next());
        System.out.println("请输入价格");
        b.setPrice(sc.next());

        list.add(b);
        System.out.println("添加成功！");

        
    }

    //删除
    public static void delete(ArrayList<Book> list) {
        // System.out.println("delete");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要删除的编号：");
            String id = sc.next();
            int index = getIndex(list, id);
            if (index == -1) {
                System.out.println("没有此编号的图书！");
            } else {
                list.remove(index);
                System.out.println("删除成功！");
                return;
            }
        }
    }

    //修改
    public static void update(ArrayList<Book> list) {
        // System.out.println("update");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要修改的编号：");
            String id = sc.next();
            int index = getIndex(list, id);
            if (index == -1) {
                System.out.println("没有此编号的图书！");
            } else {
                System.out.println("请输入书名：");
                String newName = sc.next();
                System.out.println("请输入作者：");
                String newAuthor = sc.next();
                System.out.println("请输入价格：");
                String newPrice = sc.next();

                Book b = list.get(index);
                b.setName(newName);
                b.setAuthor(newAuthor);
                b.setPrice(newPrice);
                System.out.println("修改成功！");
                System.out.println("========修改信息========");
                System.out.println("编号\t书名\t作者\t价格");
                System.out.println(b.getId() + "\t" + b.getName() + "\t" + b.getAuthor() + "\t" + b.getPrice());
                return;
            }
        }
    }

    //查询
    public static void query(ArrayList<Book> list) { 
        //System.out.println("query");
        Book b = new Book();
        if (list.size() == 0) {
            System.out.println("当前列表中没有数据，请添加后在查看吧~");
            return;
        }

        System.out.println("编号\t书名\t作者\t价格");
        for (int i = 0; i < list.size(); i++) {
            b = list.get(i);
            System.out.println(b.getId() + "\t" + b.getName() + "\t" + b.getAuthor() + "\t" + b.getPrice());
        }
    }

    public static void find(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        while (true) {
            System.out.println("请输入要查询的编号：");
            String id = sc.next();
            int index = getIndex(list, id);
            if (index == -1) {
                System.out.println("没有此编号的图书！");
            } else {
                b = list.get(index);
                System.out.println("编号\t书名\t作者\t价格");
                System.out.println(b.getId() + "\t" + b.getName() + "\t" + b.getAuthor() + "\t" + b.getPrice());
                break;
            }

        }

    }

    //判断有没有重复
    public static boolean contains(ArrayList<Book> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Book b = list.get(i);
            String uid = b.getId();
            if (uid.equals(id)) {
                return true;
            }
        }
        return false;
    }

    //根据id返回索引
    public static int getIndex(ArrayList<Book> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Book b = list.get(i);//从列表中获取索引为i的图书对象
            String uid = b.getId();//获取该图书对象的ID
            if (uid.equals(id)) {
                return i;
            }

        }
        return -1;
    }
    
}
