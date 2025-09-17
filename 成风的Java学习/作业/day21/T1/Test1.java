package T1;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
    GirlFriend gf1 = new GirlFriend("小诗诗",18,1.67);
    GirlFriend gf2 = new GirlFriend("小丹丹",19,1.72);
    GirlFriend gf3 = new GirlFriend("小惠惠",19,1.78);

    GirlFriend[] arr = {gf1,gf2,gf3};

    /* Arrays.sort(arr, new Comparator<GirlFriend>(){
        @Override
        public int compare(GirlFriend o1, GirlFriend o2) {
            double temp = o1.getAge() - o2.getAge();
            temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;//什么神仙写法

            temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

            if (temp > 0) {
                return 1;
            } else if (temp < 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }); */

    Arrays.sort(arr, (o1, o2) -> {
        double temp = o1.getAge() - o2.getAge();
        temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;// 什么神仙写法

        temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

        if (temp > 0) {
            return 1;
        } else if (temp < 0) {
            return -1;
        } else {
            return 0;
        }
    });

    System.out.println(Arrays.toString(arr));
    }
    
}
