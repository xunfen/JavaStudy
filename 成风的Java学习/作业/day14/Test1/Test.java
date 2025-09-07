package Test1;

public class Test{
    public static void main(String[] args) {
        /* Person p1 = new Person("张三", 18);
        Dog d = new Dog(2, "黑");
        p1.keepPet(d, "骨头");

        Person p2 = new Person("李四", 19);
        Cat c = new Cat(1, "白");
        p2.keepPet(c, "fish"); */

        Person p = new Person("王五", 20);
        Dog d = new Dog(2, "黑");
        p.keepPet(d, "骨头");

        Cat c = new Cat(1, "白");
        p.keepPet(c, "鱼");
    }
}