public class switchDemo1 {
    public static void main(String[] args) {
       String noodles = "兰州拉面";
       
       switch (noodles) {
        case "兰州拉面":
            System.out.println(noodles);
            break;
        case "武汉热干面":
            System.out.println(noodles);
            break;     
        case "北京炸酱面":
            System.out.println(noodles);
            break;
        case "陕西油泼面":
            System.out.println(noodles);
            break;
        default:
            System.out.println("方便面");

       }
    }
}