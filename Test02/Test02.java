package Test02;

public class Test02 {
    public static void main(String[] args) {
        //判断 101 ~ 200 之间有多少个元素，并输出所有素数

        //循环嵌套  、 break 的跳出


        int count = 0;
//外循环：遍历101~200这个范围
        for (int i = 101; i <= 200; i++){
            boolean flag = true;
            //内循环：判断是否是质数
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    flag = false;
                    //break 跳出单层循环，内循环
                    break;

                }
            }
            if (flag){
                System.out.println(i + "是质数" );
                count++;
            }/*else {
                System.out.println(i + "不是质数");
            }*/
        }
        System.out.println("一共有" + count + "个质数");

    }
}
