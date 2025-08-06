public class ValuableTest{
    //程序主入口
    public static void main(String[] args){
        //一开始无乘客
        int count = 0;
        //第一站上去一个
        count = count + 1;
        //第二站上去一个下来一个
        count = count + 2 - 1;
        //第三站上去俩个，下来一个
        count = count + 2 -1;
        //第四站下来一个
        count = count - 1;
        //第五站上去一个
        count = count +1;
        //输出
        System.out.println("最后还有"+ count + "位乘客");
    }
}
//傻子风，是Variable不是valuable