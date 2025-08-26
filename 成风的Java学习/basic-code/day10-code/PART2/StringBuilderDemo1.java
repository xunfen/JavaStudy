public class StringBuilderDemo1 {
    public static void main(String[] args) {
        /* String s = "";
        for (int i = 0; i < 1000000; i++) {
            s = s + "abc";
        }
        System.out.println(s); 
        这样子太耗时了*/
        StringBuilder sb = new StringBuilder("abc");
        //System.out.println(sb);//且StringBuilder是Java已经写好的类，Java在底层对他做了一些特殊处理，打印对象是属性值不是地址值
        sb.append(1);
        sb.append(2.3);
        sb.append(true);
        //System.out.println(sb);abc12.3true
        sb.reverse();
        //System.out.println(sb);eurt3.21cba
        
        int len = sb.length();
        System.out.println(len);//11

        
    }
    
}
