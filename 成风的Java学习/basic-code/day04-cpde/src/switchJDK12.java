public class switchJDK12 {
    public static void main(String[] args) {
        int number = 1;
        // switch (number) {
        //     case 1:
        //         System.out.println("one");
        //         break;
        //     case 2:
        //         System.out.println("two");
        //         break;
        //     case 3:
        //         System.out.println("three");
        //         break;
        // }

        // switch (number) {
        //     case 1 -> {
        //         System.out.println("one");
        //     }
        //     case 2 -> {
        //         System.out.println("two");
        //     }
        //     case 3 -> {
        //         System.out.println("three");
        //     }
        //     default -> {
        //         System.out.println("default");
        //     }
        // }


        //只有一行代码时可以省略大括号
            switch (number) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            case 3 -> System.out.println("three");
            default -> System.out.println("default");
        }

    }
}