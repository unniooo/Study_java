package background;

import hero.Gongben;
import hero.Yase;


public class Game {

    public static void main(String[] args) {

        Yase yase = new Yase("亚瑟","男",200.0f,100.0f,2000);
        Gongben gongben = new Gongben("宫本","男",200.0f,100.0f,2000);
        boolean open = true;
        //写剧本
        //亚瑟发动一技能攻击宫本
        yase.firstaction();
        System.out.println("宫本被打");
        gongben.kouXue(yase.getGjl());
        gongben.thirdaction();
        yase.kouXue(gongben.getGjl());
        gongben.secondaction();
        yase.kouXue(gongben.getGjl());
        yase.beidong();
        while (open){
            gongben.norAction();
            yase.kouXue(gongben.getGjl()- yase.getFyl());
            if (yase.getBooldnum()<0){
                System.out.println("宫本息怒……");
                System.out.println("宫本Kill亚瑟");
                open = false;
            }
        }
    }
}
