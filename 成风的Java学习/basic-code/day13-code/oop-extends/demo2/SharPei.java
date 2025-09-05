public class SharPei extends Dog{

    @Override
    public void eat() {
        super.eat();//父类里面的吃狗粮
        System.out.println("狗啃骨头");
    }
}