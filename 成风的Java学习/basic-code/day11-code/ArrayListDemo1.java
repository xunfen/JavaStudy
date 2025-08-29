import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //泛型: 指定集合中存储的数据类型
        //ArrayList<String> list = new ArrayList<String>();//集合里面不能存储基本数据类型，只能存引用数据类型
        //jdk7以后写法
        ArrayList<String> list = new ArrayList<>();
        //System.out.println(list);//[]
        
        //添加元素
        /* boolean result = list.add("aaa");//不管添加什么都是添加成功，故一般不去管返回值
        System.out.println(result);
        System.out.println(list); */

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        System.out.println(list);

        //删除元素
        //直接删除一个元素
        boolean result = list.remove("aaa");//删除成功返回true，失败则为false
        System.out.println(result);
        System.out.println(list);

        //删除指定索引的元素
        String str = list.remove(1);//删除指定索引的元素，并返回删除的元素
        System.out.println(str);
        System.out.println(list);

        //修改元素
        String resultt = list.set(1, "ddd");
        System.out.println(resultt);//会输出被修改的元素
        System.out.println(list);

        //查询元素
        String s = list.get(1);
        System.out.println(s);

        //获取集合长度
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }

    }
    
}
