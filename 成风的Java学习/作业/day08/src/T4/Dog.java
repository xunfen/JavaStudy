package T4;

public class Dog {
    private String color;
    private String breed;

    public Dog() {

    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void lookHome(){
        System.out.println(color+"的dog"+breed+"正在看家...");
    }

    public void eat(){
        System.out.println(color+"的dog"+breed+"正在吃...");
    }
}
