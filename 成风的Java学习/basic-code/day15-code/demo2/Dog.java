package Demo2;

public class Dog extends Animal implements Swim{

    public Dog(){

    }

    public Dog(String name,int age){
        super(name, age);
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("狗吃骨头");
        
    }

    @Override
    public void swim() {
        // TODO Auto-generated method stub
        System.out.println("狗刨");
        
    }
    
}