//红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。
//绿茶妹妹有24元钱，她攒了几天钱之后自己的钱正好是原来的两倍。
//那么红茶和绿茶现在的钱一样多，请问对么？

public class T2{
    public static void main(String[] args) {
        int red1 = 21;
        int green1 = 24;
        int red2 = (red1 * 2 + 3);
        int green2 = (green1 * 2);
        System.out.println(red2 == green2);
    }
}