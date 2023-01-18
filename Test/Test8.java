package Test;
//1-100之间偶数求和
public class Test8 {
    public static void main(String[] args) {
        //100.fori 就可以出现
        // for (int i = 0; i < 100; i++) {
        //
        //        }
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}
