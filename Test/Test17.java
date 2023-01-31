package Test;

public class Test17 {
    public static void main(String[] args) {
        /*定义一个数组，储存1，2，3，4，5
        * 遍历数组得到每一个元素，求数组里面所有的数据和*/

        //分析
        //1.定义一个数组，并添加数据
        int[] arr = {1,2,3,4,5};

        //求和变量
        int sum = 0;

        //2.遍历数据得到每一个数据，累加求和
        for (int i = 0; i < arr.length; i++) {
            //i 依次表示数组里面的每一个索引
            //arr[i] 依次表示数组里面的每一个元素
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }
}
