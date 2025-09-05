package Test2;

public class Maintainer extends AdminStaff{
    public Maintainer() {

    }

    public Maintainer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("维修专员正在维修");
    }
}