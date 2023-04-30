package stringdemo;
/*已知正确的用户名和密码，请用程序实现模拟用户登录
 * 总共给三个机会，登录之后，给出相应的提示*/

import java.util.Scanner;

/*
 * 已知正确的用户名和密码，请用程序实现模拟用户登录
 * 总共给三次机会，登录之后，给出相应的提示*/
public class StringDemo4 {
    public static void main(String[] args) {
        //读题拆解法

        //1.定义两个变量记录正确的用户名和密码
        String rightUsername = "zhangsan";
        String rightUserword = "123456";

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            //2.键盘录入用户名和密码

            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            //3.比较
            if (username.equals(rightUsername) && password.equals(rightUserword)) {
                System.out.println("用户登录成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("账号" + username + "被锁定，请联系工作人员");
                } else {
                    System.out.println("用户登陆失败，用户名或密码错误,您还有" + (2 - i) + "次机会");
                }
            }
        }


    }
}
