package Test02;
/*数子加密*/
public class Test06 {
    public static void main(String[] args) {
        /*某系统的数字密码（大于0），
        * 规则： 每位数字加5  再对10求余  最后将数字反转  得到新数*/

        int[] arr = {1,9,8,3};


        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }

        for (int i = 0 , j = arr.length - 1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //8 3 4 6 --> 8346

        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);

    }

}
