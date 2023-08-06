package a01MathDemo01;

public class MathDemo02 {
    //统计一共有多少个水仙花数（水仙花数是一个三位 自幂数（自幂数，一个n位自然数等于自身各个数位上数字的n次幂之和））
//因为是三位数 所以范围是100-999

    public static void main(String[] args) {

        int count = 0;


        for (int i = 100; i <= 999; i++) {
            //个位 十位 百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;


            //判断：
            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);

            if (sum == i) {
                count++;
                System.out.println(i);

            }

        }

        System.out.println(count+"个水仙花数");
    }


}
