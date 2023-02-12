package Test02;

import java.util.Scanner;
//Test01 优化

public class Test01_1 {
    /*买机票
     * 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱
     * 按照如下规则计算机票价格： 旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折*/


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入机票的原价：");
            int ticket = sc.nextInt();
            System.out.println("请输入当前的月份");
            int month = sc.nextInt();
            System.out.println("请输入当前购买的舱位 0 头等舱 1经济舱");
            int seat = sc.nextInt();



            if (month >= 5 && month <= 10) {
                //旺季
               ticket = getPrice(ticket,seat,0.9,0.85);
            } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
                //淡季
                ticket = getPrice(ticket,seat,0.7,0.65);

            }else {
                System.out.println("键盘录入的月份不合法");
            }

            System.out.println(ticket);

        }

        public static int getPrice(int ticket,int seat, double v0,double v1){
            if (seat == 0) {
                //头等舱
                ticket = (int)(ticket * v0);
            } else if (seat == 1){
                //经济舱
                ticket = (int)(ticket * v1);
            } else{
                //没有这个舱位
                System.out.println("没有这个舱位");
            }

            return ticket;

        }


}
