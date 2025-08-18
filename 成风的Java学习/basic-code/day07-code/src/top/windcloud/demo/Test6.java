import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /* 
        需求：
            某系统的数字密码（大于0），比如1983，采用加密方式进行传输。
        规则如下：
            先得到每位数，然后每位数都加上5 , 再对10求余，最后将所有数字反转，得到一串新数。 */
        Scanner sc = new Scanner(System.in);
        //获取数字
        int[] arr = new int[];
        //见part

        //加密
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }

        //反转
        for (int i = 0,j = arr.length - 1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //拼接
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }

    }
    
}
