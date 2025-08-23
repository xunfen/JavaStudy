package T5;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];

        Phone p1 = new Phone("xiaomi",1999,"白");
        Phone p2 = new Phone("huawei",2999,"黑");
        Phone p3 = new Phone("apple",3999,"金");

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum = sum + phone.getPrice();

        }

        int avg = sum / arr.length;//数据能不写死就不写死
        System.out.println("平均价格是：" + avg);


    }
}