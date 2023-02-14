package Test02;

public class Test06_1 {
    public static void main(String[] args) {
        //把整数上的每一位都添加到数组中
        //反向推导

        //计算数组长度
        int number = 12345;
        int temp = number;
        int count = 0;
        while (number != 0){
            //每一次循环就去掉右边的一个数字
            number = number / 10;

            count++;

        }

        //定义数组
        //动态初始化
        int[] arr = new int[count];
        int index = arr.length - 1;
        while (temp != 0) {
            int ge = temp % 10;
            temp = temp / 10;
            arr[index] = ge;
            index--;
        }

        //验证结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
