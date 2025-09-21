import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        Iterator<String> it = coll.iterator();// 获取迭代器
        while (it.hasNext()) {//判断当前迭代器位置是否有元素
            String str = it.next();//获取当前迭代器位置的元素
            System.out.println(str);
        }
    }
    
}
