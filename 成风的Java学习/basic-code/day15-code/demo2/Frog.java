package Demo2;

public class Frog extends Animal implements Swim{

    public Frog () {

    }

    public Frog (String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("青蛙在吃虫子");
        
    }

    @Override
    public void swim() {
        // TODO Auto-generated method stub
        System.out.println("青蛙在蛙泳");
        
    }
    
}