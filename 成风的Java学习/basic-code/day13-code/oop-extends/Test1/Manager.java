package Test1;

public class Manager extends Employee {
    private double bonus;

    public Manager() {

    }

    public Manager(String id, String name, double salary, double bonus) {//全参构造要把他爹的也带过来
        super(id, name, salary);
        this.bonus = bonus;
    }

    //他爹的不用写get/set
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}