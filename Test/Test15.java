package Test;

import java.util.Random;

public class Test15 {
    public static void main(String[] args) {
        Random r = new Random();
        //生成随机数
        //在校括号中，书写的是生成随机数的范围
        //这个范围一定是从0开始的
        //到这个数-1结束
        //口诀：包头不包尾，包左不包右
        for (int i = 0; i < 100; i++) {
            int number = r.nextInt(10);//0 ~ 99
            System.out.println(number);
        }


/*      输出0 ~ 101 的随机数
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        System.out.println(number);

        //秘诀：
        //用来生成任意数到任意数之间的随机数 7 ~ 15
        //1.让这个范围头尾都减去一个值，让这个范围从0开始 -7  0 ~ 8
        //2.尾巴+1     8+1 = 9
        //3.最终的结果：再加上第一步减去的值

        /*Random r = new Random();
        int number = r.nextInt(9) + 7;//7 ~ 15
         //  0 ~   8 + 7
        System.out.println(number);*/

    }
}
