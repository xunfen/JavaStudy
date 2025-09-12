public class SystemDemo1 {
    public static void main(String[] args) {
        //System.exit(666);//0:正常退出,非0:异常退出
        
        /* long start = System.currentTimeMillis();
        System.out.println(start); */

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] brr = new int[10];
        int[] crr = new int[10];
        int[] drr = new int[10];
        System.arraycopy(arr, 0, brr, 0, 10);
        //System.arraycopy(数据源数组, 起始索引, 目的地数组, 起始索引, 复制的长度);
        for(int i = 0; i < brr.length; i++){
            System.out.print(brr[i] + " ");
        }
        System.out.println();

        System.arraycopy(arr, 0, crr, 4, 3);
        for(int i = 0; i < crr.length; i++){
            System.out.print(crr[i] + " ");
        }
        System.out.println();

        System.arraycopy(arr, 6, drr, 2, 3);
        for(int i = 0; i < drr.length; i++){
            System.out.print(drr[i] + " ");
        }
        //tips:1.如果数据源数组与目的地数组都是基本数据类型，俩者类型必须保持一致，否则报错给你看
        //      2.在拷贝的时候要考虑数组范围，如果超出范围，报错
        //      3.如果数据源数组与目的地数组都是引用数据类型，子类类型可以赋给父类类型，但是父类类型不能赋给子类类型
    }
    
}
