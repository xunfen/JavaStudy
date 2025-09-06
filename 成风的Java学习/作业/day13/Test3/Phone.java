package Test3;

public class Phone {
    private String brand;
    private int price;
    private static double size = 6;

    public Phone() {

    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static double getSize() {
        return size;
    }

    public static void setSize(double size) {
        Phone.size = size;
    }

    public void call() {
        System.out.println("打电话");
    }

    public void sendMessage() {
        System.out.println("发短信");
    }

    public void playGame() {
        System.out.println("打游戏");
    }
}