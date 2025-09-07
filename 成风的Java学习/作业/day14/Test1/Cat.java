package Test1;

public class Cat extends Animal {
    public Cat() {

    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String sth) {
        System.out.println(getAge() + "岁的" + getColor() + "的猫吃" + sth);
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}