package Test;

import java.util.Scanner;

/*求质数*/
public class Test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = sc.nextInt();

        //定义一个变量，标记变量
        //标记着number是否为一个质数
        //true：是
        //false：不是

        //表示最初number是一个质数
        boolean flag = true;

        for (int i = 2; i < number; i++) {
            //i表示这个范围内的每一个数字
            if (number % i == 0){
                flag = false;
                //System.out.println(number + "不是一个质数");
                break;
            }/*else{
                System.out.println(number + "是一个质数");
            }*/
        }
        if (flag){
            System.out.println(number + "是一个质数");
        }else {
            System.out.println(number + "不是一个质数");
        }
    }
}
