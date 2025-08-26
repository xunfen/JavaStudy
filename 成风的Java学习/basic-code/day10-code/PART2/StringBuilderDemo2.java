public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");
        //把StringBUilder变回字符串
        String str = sb.toString();
        System.out.println(str);

    }
    
}
