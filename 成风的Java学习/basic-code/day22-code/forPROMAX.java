import java.util.ArrayList;
import java.util.Collection;

public class forPROMAX {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        //增强for
        for (String s : coll) {
            System.out.println(s);
        }
        
    }
    
}
