public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println("-----------------");
        System.out.println("数组的长度是" + array.length);
        for (int i = 0 ; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }
    
}
