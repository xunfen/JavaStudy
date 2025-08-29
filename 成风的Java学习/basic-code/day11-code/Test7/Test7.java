package Test7;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();

        Phone p1 = new Phone("xiaomi",1000);
        Phone p2 = new Phone ("iPhone",8000);
        Phone p3 = new Phone("chuizi",2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> list2 = getPhoneInfo(list);

        for (int i = 0; i < list2.size(); i++) {
            Phone p = list2.get(i);
            System.out.println(p.getBrand() + "," + p.getPrice());
        }

    }

    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list) {
        ArrayList<Phone> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int price = p.getPrice();
            if (price < 3000) {
                //System.out.println(p.getBrand() + "," + p.getPrice());
                list2.add(p);
            }
        }
        return list2;
    }
}