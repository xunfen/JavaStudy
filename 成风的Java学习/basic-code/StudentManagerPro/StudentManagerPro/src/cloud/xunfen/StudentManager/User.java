package day12;

public class User{
    private String Username;
    private String Password;
    private String ID;
    private String Phone;

    public User() {

    }

    public User(String Username, String Password, String ID, String Phone) {
        this.Username = Username;
        this.Password = Password;
        this.ID = ID;
        this.Phone = Phone;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
}