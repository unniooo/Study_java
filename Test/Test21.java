package Test;

import java.util.Random;

public class Test21 {
    public static void main(String[] args) {
        //需求： 生成10个1~100之间的随机数存入数组
        /*1.求出所有数据的和
         * 2.求所有数据的平均数
         * 3.统计有多少个数据比平均值小*/
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.println("数组中所有数据的和为：" +sum);

        //2.
        int avg = sum / arr.length;
        System.out.println("数组中平均数为：" + avg);

        //3.

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg){
                count++;
            }
        }
        System.out.println("在数组中，一共有" + count + "个数据，比平均数小");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
