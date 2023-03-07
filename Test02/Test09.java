package Test02;

import java.util.Random;

/*抢红包
* 需求：
* 一个直播抽奖，奖品时现金红包，分别有{2，588，888，1000，10000}五个奖金。请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。  */
public class Test09 {
    public static void main(String[] args) {


        int[] arr = {2,588,888,1000,10000};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);

            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
