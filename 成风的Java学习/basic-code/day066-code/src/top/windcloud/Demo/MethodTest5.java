public class MethodTest5 {
    public static void main(String[] args) {
        double Area1 = getArea(5.3,1.7);
        double Area2 = getArea(5.4,2.7);
        if (Area1 > Area2) {
            System.out.println("第一个长方形面积大");
        } else {
            System.out.println("第二个长方形面积大");
        }
        
    }

    public static double getArea(double len, double width) {
        return len * width;
    }
    
}
