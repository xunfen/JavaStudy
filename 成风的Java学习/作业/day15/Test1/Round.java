package Test1;

public class Round extends Shape {
    private double radius;
    private final double PI = 3.14;

    public Round() {

    }

    public Round(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void Area() {
        double area = PI * radius * radius;
        System.out.println("圆的面积为" + area);
    }

    @Override
    public void Perimeter() {
        double perimeter = 2 * PI * radius;
        System.out.println("圆的周长为" + perimeter);
    }
}