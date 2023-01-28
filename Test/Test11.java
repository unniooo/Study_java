package Test;

public class Test11 {
    //给定两个整数（int范围内）相除得到商和余数，要求使用乘法、除法、和%运算符

    public static void main(String[] args) {
        int dividend = 100;
        int divisor = 37;
        int count = 0;
        while (dividend >= divisor){
            dividend = dividend - divisor;
            count++;

        }
        System.out.println("余数为："+dividend);//余数
        System.out.println("商为："+count);
    }
}
