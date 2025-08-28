public class Test6 {
    public static void main(String[] args) {
        String s = "Avicii Forever";
        char[] c = s.toCharArray();
        StringBuilder temp = new StringBuilder();
        for (int i = c.length - 1; i >= 0; i--) {
            if (c[i] == ' ') {
                break;
            }
            temp.append(c[i]);
        }
        //System.out.println(temp.toString());

        String str = temp.toString();
        System.out.println(str.length());
    }
    
}
