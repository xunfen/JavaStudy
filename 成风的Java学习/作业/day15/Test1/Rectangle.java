package Test1;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {

    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void Area() {
        double area = length * width;
        System.out.println("长方形的面积为" + area);
    }

    @Override
    public void Perimeter() {
        double perimeter = (length + width) * 2;
        System.out.println("长方形的周长为" + perimeter);
    }
}