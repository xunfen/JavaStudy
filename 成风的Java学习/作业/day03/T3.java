//某小伙想定一份外卖，商家的优惠方式如下：
//鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。
//订单满30元8折优惠。鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。
//那么这个小伙要点这三样东西，最少要花多少钱？
public class T3{
    public static void main(String[] args) {
        double dandian = (24 + 8 + 3) * 0.8;
        double youhui = 16 + 8 + 3;//int与double类型不同，而double取值范围大于int,故用隐式转换把int转为double
        System.out.println(dandian < youhui ? dandian : youhui);
    }
}