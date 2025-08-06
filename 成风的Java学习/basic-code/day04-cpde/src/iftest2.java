public class iftest2 {
    public static void main(String[] args) {
        boolean isLightGreen = false;
        boolean isLightYellow = false;
        boolean isLightRed = true;

        if (isLightGreen) {
            System.out.println("GO!GO!GO!");
        }

        if (isLightYellow) {
            System.out.println("slow");
        }

        if (isLightRed) {
            System.out.println("stop");
        }
    }
}