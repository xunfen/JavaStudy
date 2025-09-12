public class MathTest1 {
    //一个整数的任意一对因子中其中一个必定小于等于该数的平方根，另外一个一定大于等于该数的平方根
    public static void main(String[] args) {
        System.out.println(inPrime(9));
    }

    public static boolean inPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
