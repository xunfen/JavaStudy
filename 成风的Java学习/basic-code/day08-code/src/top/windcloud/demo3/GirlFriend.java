package top.windcloud.demo3;

public class GirlFriend {
    
    private int age;

    /* public void method() {
        int age = 10;
        System.out.println(age);//就近原则，H8的age离他更近，返回10
    }*/

   /*  public void method() {
        int age = 10;
        System.out.println(this.age);//加了this就用成员变量
    } */

    public void method() {
        int age = 10;
        this.age = age;//把10赋给成员变量age
        System.out.println(age);
    }
}

