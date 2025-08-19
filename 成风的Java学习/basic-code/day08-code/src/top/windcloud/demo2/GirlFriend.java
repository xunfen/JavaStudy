package top.windcloud.demo2;

public class GirlFriend {
    //属性,名词，一般情况下只定义不给值
    private String name;
    private int age;
    private String gender;

    //针对每一个私有化的成员变量(private)，都要提供get与set方法
    //set方法：给成员变量赋值
    //get：对外提供成员变量的值


    //给成员变量name赋值
    public void setName(String n){
        name = n;
    }
    //对外提供name的属性
    public String getName(){
        return name;
    }

    //给成员变量age赋值
    public void setAge(int a){
        if (a >= 18 && a < 40){
            age = a;
        } else {
            System.out.println("非法数据");
        }
    }

    //对外提供age的属性
    public int getAge(){
        return age;
    }

    //给成员变量gender赋值
    public void setGender(String g){
        gender = g;
    }

    //对外提供gender的属性
    public String getGender(){
        return gender;
    }


    //行为，动词
    public void sleep(){
        System.out.println("女朋友在睡觉");
    }

    public void eat(){
        System.out.println("女朋友在吃东西");
    }
}
