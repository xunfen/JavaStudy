package T6;

public class GirlFriendTest{
    public static void main(String[] args) {
        GirlFriend[] arr = new GirlFriend[4];

        GirlFriend gf1 = new GirlFriend("小诗诗",18,"萌妹子","吃零食");
        GirlFriend gf2 = new GirlFriend("小丹丹",19,"萌妹子","萌妹子");
        GirlFriend gf3 = new GirlFriend("小惠惠",20,"小可爱","看书，学习");
        GirlFriend gf4 = new GirlFriend("小丽丽",21,"憨妹子","睡觉");

        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) { 
            //sum += arr[i].getAge();
            GirlFriend gf = arr[i];
            sum += gf.getAge();
        }

        int avg = sum / arr.length;
        System.out.println("平均年龄为：" + avg);

        int count = 0;
        for (int i = 0; i < arr.length; i++) { 
            GirlFriend gf = arr[i];
            if (gf.getAge() < avg) {
                System.out.println(gf.getName() + "," + gf.getAge() + "," + gf.getGender() + "," + gf.getHobby());
                count++;
            }
        }
        System.out.println("低于平均年龄的个数为：" + count);
    }
}