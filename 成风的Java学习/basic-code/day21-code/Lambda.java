import java.util.Comparator;
import java.util.Arrays;

public class Lambda {
    public static void main(String[] args) {
        String[] arr = { "aaa", "aa", "aaaaa", "a" };
        /* Arrays.sort(arr,new Comparator<String>() {
            @Override
            public int compare(String o1,String o2) {
                return o1.length() - o2.length();
            }
        }); */

        //lambda 表达式
        Arrays.sort(arr, (o1,o2) -> o1.length() - o2.length());

        System.out.println(Arrays.toString(arr));
    }

}
