package Test;

import java.util.Random;

public class Test23 {
    public static void main(String[] args) {
        /*定义一个数组，存入1~5.要求打乱数组中所有的顺序*/

        //获取数组中的随即索引
        /*int[] arr = {1,2,3,4,5};
        //索引范围：0 1 2 3 4
        Random r = new Random();
        int randomIndex = r.nextInt(arr.length);
        System.out.println(randomIndex);
*/

        //1. 定义数组存储
        int[] arr = {1,2,3,4,5};
        //2.循环遍历数组，从0开始打乱数组的顺序
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //生成一个随机索引
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            //拿着随即索引指向的元素 跟 i 指向的元素进行交换
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
