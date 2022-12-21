package control;

import Menu.Menu;
import robot.Robot;

import java.util.Scanner;

public class Control {

    public static void main(String[] args) {
        Robot robot = new Robot();
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        menu.menuOne();

        while(true){
            System.out.println("请选择运行模式：");
            int N = sc.nextInt();
            switch (N) {
                case 1:
                    robot.Xichen();
                    break;
                case 2:
                    robot.saodtuodi();
                    break;
            }
            if (N>2) {
                System.out.println("请重新输入！");
            }else {
                System.out.println("请选择清洁强度：");
                int K = sc.nextInt();
                if(K==3||K==4){
                    System.out.println("机器人开始运行");
                    break;
                }else {
                    System.out.println("请重新输入！");
                }
            }

            }
            int J = sc.nextInt();
            if (J==0) {
                robot.honggan();
            }


        }
    }
