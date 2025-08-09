public class MethodTest3 {
    public static void main(String[] args) {
        getLength(5.2,1.3);
    }

    public static void getLength(double len, double width) {
        double resule = (len + width) * 2;
        System.out.println(resule);
    }
    
}
