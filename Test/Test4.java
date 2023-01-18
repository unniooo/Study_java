package Test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        /*需求：键盘输入星期数，输出工作日、休息日。
        （1-5）工作日，（6-7）休息日。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个整表示星期");
        int week = sc.nextInt();
        switch (week){
            case 1:
                System.out.println("工作日");
                break;
            case 2:
                System.out.println("工作日");
                break;
            case 3:
                System.out.println("工作日");
                break;
            case 4:
                System.out.println("工作日");
                break;
            case 5:
                System.out.println("工作日");
                break;
            case 6:
                System.out.println("休息日");
                break;
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个星期");
                break;

            //简化后
            //第一种
/*          case 1,2,3,4,5:
                System.out.println("工作日");
                break;
            case 6,7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个星期");
                break;
*/
            //第二种（最简化）
/*          case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("没有这个星期");
*/


        }
    }
}
