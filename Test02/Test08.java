package Test02;

import java.util.Random;

/*抢红包
* 需求：
* 一个直播抽奖，奖品时现金红包，分别有{2，588，888，1000，10000}五个奖金。请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。  */
public class Test08 {
    public static void main(String[] args) {



//1.定义数组表示奖池
        int[] arr = {2,588,888,1000,10000};
//2.定义新数组用于存储抽奖的结果
        int[] newArr = new int[arr.length];
//3.抽奖
        Random r = new Random();
        for(int i = 0; i < 5; ){
            int randmIndex = r.nextInt(arr.length);
            int prize = arr[randmIndex];
            boolean flag = contains(newArr,prize);
            if (!flag) {
                newArr[i] = prize;
                //添加完毕后，移动索引
                i++;
            }
        }
        //4.遍历newArr
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }


    public static boolean contains(int[] arr,int prize){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize){
                return true;
            }
        }
        return false;
    }


}
