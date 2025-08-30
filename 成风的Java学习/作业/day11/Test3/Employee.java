package Test3;

public class Employee { 
    private String name;
    private int wage;

    public Employee() {

    }

    public Employee(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
}