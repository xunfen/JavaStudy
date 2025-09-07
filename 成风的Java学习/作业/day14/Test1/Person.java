package Test1;

public class Person {
    private String name;
    private int age;

    public Person() {

    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    /* public void keepPet(Dog dog, String sth) {
        System.out.println("年龄为" + age + "岁的" + name + "养了一只" + dog.getColor() + "颜色的狗");
        dog.eat(sth);
    }

    public void keepPet(Cat cat, String sth) {
        System.out.println("年龄为" + age + "岁的" + name + "养了一只" + cat.getColor() + "颜色的猫");
        cat.eat(sth);
    } */

    public void keepPet(Animal a, String sth) {
        if (a instanceof Dog d) {
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + a.getColor() + "颜色的" + a.getAge() + "岁的dog");
            d.eat(sth);
        } else if (a instanceof Cat c) {
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + a.getColor() + "颜色的" + a.getAge() + "岁的cat");
            c.eat(sth);
        } else {
            System.out.println("没有这种动物");
        }

        //System.out.println("年龄为" + age + "岁的" + name + "养了一只" + a.getColor() + "颜色的" + a.getAge() + "岁的动物");
        //a.eat(sth);
    }

    
}