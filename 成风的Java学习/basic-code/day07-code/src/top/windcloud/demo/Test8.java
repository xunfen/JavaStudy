import java.util.Random;
import java.util.Scanner;

class Test8 {

    public static void main(String[] args) {
        //生成中奖号码
        int[] arr = createNumber();
        /* System.out.println("================================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("================================");
 */

        //用户输入彩票号码
        int[] userArr = userInputNum();
        /* for (int i = 0; i < userArr.length; i++) {
            System.out.print(userArr[i] + " ");
        } */

        //判断中奖情况
        int redCount = 0;
        int blueCount = 0;
        
        //判断红球
        for (int i = 0; i < userArr.length - 1; i++) {
            int redNum = userArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (redNum == arr[j]) {
                    redCount++;
                    break;
                }
            }
        }

        //判断蓝球
        int blueNum = userArr[userArr.length - 1];
        if (blueNum == arr[arr.length - 1]) {
            blueCount++;
        }

        //根据红球与蓝球个数，返回中奖等级
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜你，中奖1000万");
        } else if (redCount == 6 && blueCount ==0) {
            System.out.println("恭喜你，中奖500万");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你，中奖3000元");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜你，中奖2000元");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜你，中奖10元");
        } else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜你，中奖5元");
        } else {
            System.out.println("谢谢参与");
        }

       
        
    }

    public static int[] createNumber() {
        //6个红球，1个蓝球
        int[] arr = new int[7];
        Random r = new Random();
        //生成红球号码
        for (int i = 0; i < 6;) {
            int redNum = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNum);
            if(!flag) {
                arr[i] = redNum;
                i++;
            }

        }

        //生成蓝球号码
        int blueNum = r.nextInt(16) + 1;
        arr[6] = blueNum;

        return arr;
    }


    //判断数据在数组中是否存在
    public static boolean contains(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;

    }

    public static int[] userInputNum() {
        int arr[] = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6;) {
            System.out.println("请输入第" + (i + 1) + "个数字：");
            int redNum = sc.nextInt();
            if (redNum >= 1 && redNum <= 33) {
                boolean flag = contains(arr, redNum);
                if(!flag) {
                    arr[i] = redNum;
                    i++;
                } else {
                    System.out.println("当前红球号码已存在，请重新输入");
                }
            } else {
                System.out.println("输入的数字不在1-33之间，请重新输入：");
            }
        }

        System.out.println("请输入蓝球号码");
        while (true) {
            int blueNum = sc.nextInt();
        if (blueNum >= 1 && blueNum <= 16) {
            arr[6] = blueNum;
            break;
        } else {
            System.out.println("输入的数字不在1-16之间，请重新输入：");
        }
        }
        
        return arr;
    }
}