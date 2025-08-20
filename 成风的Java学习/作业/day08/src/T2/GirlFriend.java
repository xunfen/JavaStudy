package T2;

public class GirlFriend {
/* 定义一个女朋友类。女朋友的属性包含：姓名，身高，体重。行为包含：洗衣服wash()，做饭cook()。另外定义一个用于展示三个属性值的show()方法。
请在测试类中通过有参构造方法创建对象并赋值，然后分别调用展示方法、洗衣服方法和做饭方法。打印效果如下：
```
我女朋友叫凤姐,身高155.0厘米,体重130.0斤
女朋友帮我洗衣服
女朋友给我做饭
``` */
    private String name;
    private int height;
    private int weight;

    public GirlFriend(){

    }

    public GirlFriend (String name,int height,int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight(int height) {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight(int weight) {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void wash(){
        System.out.println("女朋友帮我洗衣服");
    }

    public void cook(){
        System.out.println("女朋友给我做饭");
    }

    public void show(){
        System.out.println("我女朋友叫" + name + "，身高" + height + "，体重" + weight);
    }
}
