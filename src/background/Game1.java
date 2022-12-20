package background;

import Menu.Calsmenu;
import cals.Calcu;
import tool.Calculator;

import java.util.Scanner;

public class Game1 {

    public static void main(String[] args) {
        Calsmenu calculator = new Calsmenu();
        while (true) {
            calculator.menuOne();
            Calcu calcu = new Calcu();
            Scanner sc = new Scanner(System.in);
            float x = 0.0f;
            float y = 0.0f;
            System.out.println("请输入要计算的两个数：");
            System.out.println("请输入第一个数（x）：");
            x = sc.nextFloat();
            System.out.println("请输入第二个数（y）：");
            y = sc.nextFloat();
            System.out.println("请输入你的操作：");
            int a = sc.nextInt();
            System.out.println("输入的值为：" + a);
            switch (a) {
                case 1:
                    calcu.add(x, y);
                    break;
                case 2:
                    calcu.jianFa(x, y);
                    break;
                case 3:
                    calcu.chenFa(x, y);
                    break;
                case 4:
                    calcu.chuFa(x, y);
                    break;
                case 5:
                    calcu.N_chenfa(x, y);
                    break;

                default:
                    //报错
                    System.out.println("非法输入！");

            }

        }
    }
}
