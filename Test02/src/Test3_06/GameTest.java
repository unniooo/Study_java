package Test3_06;

public class GameTest {
    public static void main(String[] args) {
        //1.创建两个角色
        Role r1 = new Role("乔峰",100);
        Role r2 = new Role("鸠摩智",100);
        //2.开始格斗 回合制游戏
        while (true) {
            //r1开始攻击r2
            r1.attack(r2);
            //判断r2的剩余血量
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "K.O" + r2.getName());
                break;
            }

            //r2开始攻击人
            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "K.O" + r1.getName());
                break;
            }
        }


    }
}
