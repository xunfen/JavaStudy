public class Test6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] brr = {1,2,3};
        boolean resulte = equals(arr, brr);
        System.out.println(resulte);
    }

    public static boolean equals(int[] arr, int[] brr) {
        if (arr.length != brr.length) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != brr[i]) {
                return false;
            }
        }
        return true;
}
}


//疑问：为什么改成void直接用syso输出会有问题，但是boolean 用return输出没有问题？
    