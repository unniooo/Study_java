package Test02;

public class Test07 {
    public static void main(String[] args) {
        /*密码输入
         * 要求：
         * 每位数加上5
         * 再对10求余
         * 最后将所有的数字反转
         * 按照以上规则进行解密：  1983 -> 8346 -> 1983*/

        int[] arr = {8, 3, 4, 6};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] = arr[i] + 10;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }

        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);




    }
}
