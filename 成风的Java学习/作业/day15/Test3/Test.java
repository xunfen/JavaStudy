package Test3;

public class Test {
    public static void main(String[] args) {
        /*
         * ### 需求：
         * 1. 定义手机类
         * ​ 行为：打电话,发短信
         * 2. 定义接口IPlay
         * ​ 行为：玩游戏
         * 3. 定义旧手机类继承手机类
         * ​ 行为：继承父类的行为
         * 4. 定义新手机继承手机类实现Play接口
         * 行为：继承父类的行为,重写玩游戏方法
         * 5. 定义测试类
         * ​ 在测试类中定义一个 用手机的方法,要求该方法既能接收老手机对象,也能接收新手机对象
         * ​ 在该方法内部调用打电话,发短信以及新手机特有的玩游戏方法
         */
        /* 1. 接口Play中有一个方法playGame()，在测试类中如何调用该方法？
​		要求1.创建子类实现接口的方式实现
		要求2:用匿名内部类实现

            T2. 一个抽象类Fun中有一个抽象方法 fun() , 在测试类中如何调用该方法?
​		要求1.创建子类继承抽象类的方式实现
		要求2:用匿名内部类实现 */

        Phone OP = new OldPhone();
        OP.Call();
        OP.SendMessage();

        System.out.println("=========================");

        Phone NP = new NewPhone();
        NP.Call();
        NP.SendMessage();
        ((NewPhone) NP).playGame(); //因为你创建的是phone类型，你用的NP来修饰他但是他并不一定是new的，所以我要给他强转成new的，只有new的才可以打游戏，old不能打游戏
                                   //还有个链式编程在这里，转完直接点调用playgame

        System.out.println("=========================");

        Fun f = new Fun() {
            @Override
            public void fun() {
                System.out.println("手机正在实现fun功能");
            }
        };
        f.fun();

        /* if (OP instanceof NewPhone) {
            NewPhone newPhone = (NewPhone) OP;
        } else {
            OldPhone oldPhone = (OldPhone) OP;
        } */

    }

}
