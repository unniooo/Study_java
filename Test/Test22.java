package Test;

public class Test22 {
    public static void main(String[] args) {
        /*定义一个数组，存入1，2，3，4，5，交换首尾索引对应的元素
        * 交换前： 1，2，3，4，5
        * 交换后： 5 4 3 2 1 */

/*        int[] arr = {1,2,3,4,5};
        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");// 5 2 3 4 1
        }*/

        int[] arr = {1,2,3,4,5};

        for(int i = 0,j = arr.length - 1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");//5 4 3 2 1 
        }

    }
}
