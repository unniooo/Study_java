package Test;

import java.util.Random;
import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        //需求：程序自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少

        //生成随机数的代码 int number = r.nextInt(100) + 1;
        //不能写在循环里面，否则每次会产生一个新的随机数

        //抽奖机制
        /*
        * 用点券去抽水晶
        * 保底 360次*/

        int count = 0;
        //生成
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        System.out.println(number);
        //猜
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入你要猜的数字");
            int guessNumber = sc.nextInt();
            //判断 给提示
            count++;
            if (count == 3){
                System.out.println("猜中了");
                break;
            }
            if (guessNumber > number){
                System.out.println("大了");
            }else if (guessNumber < number){
                System.out.println("小了");
            }else {
                System.out.println("猜中了");
                break;
            }
        }



    }
}
