package Test;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        /* 键盘录入两个数字，表示一个范围
        * 统计这个范围中
        * 既能被3整除，又能被5整除的数字有多少个 */

       
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个数字表示范围开始");
        int start = sc.nextInt();
        System.out.println("请录入一个数字表示范围结束");
        int end = sc.nextInt();

        int count = 0;

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0){
               // System.out.println(i);
                count++;

            }
            
        }
        System.out.println(count);



    }
}
