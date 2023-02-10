package Test;

/*复制数组*/

/*定义一个方法copyOfRange(int[] arr,int from,int to)
 * 功能： 将数组arr中索引from（包含from）开始。
 * 到索引to结束（不包含to）的元素复制到新数组中，将新数组返回*/
public class Test31 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] coprArr = copyOfRange(arr, 3, 7);
        for (int i = 0; i < coprArr.length; i++) {
            System.out.print(coprArr[i] + " ");
        }

    }

    public static int[] copyOfRange(int[] arr, int from, int to) {//3~7 (3 4 5 6)
        //定义数组
        int[] newArr = new int[to - from];
        //拷贝
        //伪造索引
        int index = 0;
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;

    }


}
