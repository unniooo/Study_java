package Test;

public class Test18 {
    public static void main(String[] args) {
        /*定义一个数组，储存 1~10
        * 遍历数组得到一个元素，统计数组里面一共有多少个能被 3 整除的数字*/

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0){
                //System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("数组里面能被 3 整除的数字一共有"+count+"个");

    }
}
