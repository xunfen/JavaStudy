package day12;

import java.util.Scanner;
import java.util.ArrayList;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> list = new ArrayList<>();
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("1.登录系统");
            System.out.println("2.注册系统");//0k
            System.out.println("3.忘记密码");
            System.out.println("4.退出系统");
            System.out.println("====================");
            System.out.println("请输入你的选择：");

            String choice = sc.next();
            switch (choice) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forget();
                case "4" -> {
                    System.exit(0);
                }
                default -> System.out.println("输入错误！");
            }
        }

    }

    public static void login(ArrayList<User> list) {
        System.out.println("login");
    }

    //注册
    public static void register(ArrayList<User> list) {
        // System.out.println("register");
        Scanner sc = new Scanner(System.in);
        User u = new User();
        while (true) {
            System.out.println("请输入用户名：");
            String username = sc.next();
            boolean flag = contains(list, username);
            if (flag) {
                System.out.println("用户名已存在！");// 判断用户名唯一性
            } else {
                boolean flagg = checkUsername(username);// 交给check'方法判断剩下的要求(false代表有问题)
                if (!flagg) {
                    System.out.println("您的用户名不合法哦！再重新试试看吧~");
                    continue;
                } else {
                    // 用户名通过
                    // 写入用户名
                    u.setUsername(username);
                    System.out.println("用户名设置成功！");
                    break;

                }
            }
        }

        // 设置密码
        while (true) {
            System.out.println("请输入密码：");
            String passwordFir = sc.next();
            System.out.println("请再次输入密码：");
            String passwordSec = sc.next();

            if (passwordFir.equals(passwordSec)) {
                u.setPassword(passwordFir);
                System.out.println("密码设置成功！");
                break;
            } else {
                System.out.println("密码不一致！请重新输入！");
            }

        }

        // 设置身份证号码
        loop: while (true) {
            System.out.println("请输入身份证号码：");
            String ID = sc.next();
            if ((ID.length() != 18) || (ID.charAt(0) == '0')) {
                System.out.println("身份证不合法！");
                continue;
            }
            char c = ID.charAt(17);
            // 检查最后一位是否合法（是数字、'x'或'X'）
            if ((c < '0' || c > '9') && c != 'x' && c != 'X') {
                System.out.println("身份证不合法！");
                continue;
            }
            // 判断前17位
            for (int i = 0; i < 17; i++) {
                char cc = ID.charAt(i);
                if (cc < '0' || cc > '9') {
                    System.out.println("身份证不合法！");
                    continue loop;
                }
            }

            u.setID(ID);
            System.out.println("身份证设置成功！");
            break;
        }

        // 设置电话号码
        while (true) {
            System.out.println("请输入电话号码：");
            String phone = sc.next();
            if ((phone.length() != 11) || (phone.charAt(0) != '1')) {
                System.out.println("电话号码不合法！");
                continue;
            }
            for (int i = 1; i < phone.length(); i++) {
                char ccc = phone.charAt(i);
                if (ccc < '0' || ccc > '9') {
                    System.out.println("电话号码不合法！");
                    continue;
                }
            }
            u.setPhone(phone);
            System.out.println("电话号码设置成功！");
            break;
        }

        list.add(u);
        System.out.println("注册成功！");

    }

    public static void forget() {
        System.out.println("forget");
    }

    // 判断用户名是否存在
    public static boolean contains(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    // 验证用户名是否合法
    public static boolean checkUsername(String username) {
        if (username.length() <= 2 || username.length() >= 15) {
            // System.out.println("用户名长度必须在2-15位之间！");//判断长度3-15位
            return false;
        }
        // 判断是否为字母+数字
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);// 判断是否有特殊符号
            if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9')) {
                return false;
            }
        }

        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
            }
        }

        if (count <= 0) {
            return false;
        }

        return true;
    }

}