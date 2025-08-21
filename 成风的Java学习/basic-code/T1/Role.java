import java.util.Random;


public class Role {
        private String name;
        private int blood;

        public Role () {

        }

        public Role (String name, int blood) {
            this.name = name;
            this.blood = blood;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getBlood() {
            return blood;
        }

        public void setBlood(int blood) {
            this.blood = blood;
        }

        //定义攻击方法
        //谁攻击谁
        public void attack(Role role){
            //计算造成的伤害
            Random r = new Random();
            int hurt = r.nextInt(20) + 1;

            //修改挨揍的人的血量
            int remainBlood = role.getBlood() - hurt;

            //判断血量是否为负
            remainBlood = remainBlood < 0 ? 0 : remainBlood;
            role.setBlood(remainBlood);

            System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下," + "造成了" + hurt + "点伤害，" + role.getName() + "还剩下" + remainBlood + "点血");//this代表方法调用者
        }
    }
    
