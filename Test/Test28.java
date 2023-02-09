package Test;
/*数组遍历
* 设计一个方法用于数组遍历，要求遍历的结果是在一行上的  eg: [11,22,33,44,55]  */
public class Test28 {

    public static void main(String[] args) {
        //定义数组
        int[] arr = {11,22,33,44,55};

        //调用
        pringtArr(arr);

        System.out.println();//不打印任何数据，只做换行处理
    }

    public static void pringtArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ",");
            }
        }

        System.out.print("]");

    }

}
