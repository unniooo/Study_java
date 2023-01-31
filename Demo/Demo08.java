package Demo;

public class Demo08 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {1,2,3,4,5,1};
        //2.获取数组里面的所有元素
        //格式： 数组名[索引]
        /*System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);*/

        //利用循环改进代码
        //开始条件：0
        //结束条件：数组的长度 - 1 （最大索引）
        /*for (int i = 0; i < 5; i++) {
            //i: 0 1 2 3 4
            System.out.println(arr[i]);
        }*/

        //在Java中，关于数组的一个长度属性，length
        //调用方式：数组名。length
        //System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            //i: 0 1 2 3 4
            System.out.println(arr[i]);//1 2 3 4 5 1
        }

        //扩展
        //自动的快速生成数组的遍历方式
        //idea提供的
        //数组名.fori     /*eg: arr.fori*/

        for (int i = 0; i < arr.length; i++) {
            
        }
        

    }
}
