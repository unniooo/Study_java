package Test;

public class Test19 {
    public static void main(String[] args) {
        /*定义一个数组，储存 1~10
         * 遍历数组得到一个元素，
         * 要求：
         * 1.如果是奇数，则将当前数字扩大两倍
         * 2.如果是偶数，则将当前数字变成二分之一*/

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            //i 依次表示数组里面的每一个索引
            //arr[i] 依次表示数组里面的每一个元素
            if (arr[i] % 2 == 0){
                arr[i] = arr[i] / 2;

            }else {
                arr[i] = arr[i] * 2;
            }
        }
        //遍历数组
        //一个循环尽量只做一件事情。
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
