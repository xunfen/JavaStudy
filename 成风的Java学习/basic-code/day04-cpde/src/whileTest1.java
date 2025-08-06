public class whileTest1 {
    public static void main(String[] args) {
        double i = 0.1;
        int count = 0;
        while (i < 8844430) {
            i = i * 2;//a *= 2;
            count++;
        }
        System.out.println(count);
    }
    
}
