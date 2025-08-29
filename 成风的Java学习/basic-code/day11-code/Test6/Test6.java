package Test6;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("heima001","zhangsan","123456");
        User u2 = new User("heima002","lisi","12345678");
        User u3 = new User("heima003","wangwu","1234qwer");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        boolean flag = contains(list, "heima001");
        System.out.println(flag);
        
    }

    public static boolean contains(ArrayList<User> list,String id) {
        for (int i = 0; i < list.size(); i++) {
            //list.get(i).getId().equals(id);
            User u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)) {
                return true;
            }
        }
        return false;
    }
    
}
