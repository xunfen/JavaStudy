public class StringBuilderDemo5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //capacity容量：最多装多少
        //length长度：当前有多少
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        /* sb.append("abc");
        System.out.println(sb.capacity());
        System.out.println(sb.length()); 
        美满不扩容*/

        /* sb.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        //老容量*2+2 */

        sb.append("abcdefghijklmnopqrstuvwxyz0123456789");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        //如果超过16*2+2，就会以实际容量为准
        
    }
    
}
