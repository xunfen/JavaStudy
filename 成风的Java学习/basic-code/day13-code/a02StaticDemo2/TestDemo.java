package a02StaticDemo2;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        String str = ArrayUtil.printArray(arr1);
        System.out.println(str);

        double[] arr2 = {1.1,2.2,3.3,4.4,5.5};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}