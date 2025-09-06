package Test3;

public class Test {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setBrand("华为");
        p1.setPrice(5999);
        System.out.println(p1.getBrand() + ":" + p1.getPrice() + " " + p1.getSize());
        p1.call();
        p1.playGame();
        p1.sendMessage();

        Phone p2 = new Phone("小米", 1999);
        p2.setSize(5.5);
        System.out.println(p2.getBrand() + ":" + p2.getPrice() + " " + p2.getSize());
        p2.call();
        p2.playGame();
        p2.sendMessage();
    }
}