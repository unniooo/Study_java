package Test;
//1+2+3+4+5
public class Test7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1;i <= 5;i++){
            //1.求和的变量不能定义在循环里面，因为变量只在所属的打括号中有效
            //2.如果我们把变量定义在循环的里面，那么当前变量只能在本次循环中有效
            //当本次循环结束之后，变量就会重新从内存中消失
            // 当地第二次循环开始时侯，优惠重新定义一个新的变量
            //结论：如果以后要写累加求和的变量，可以把变量定义在循环的外面
            //int sum = 0;
            //System.out.println(i);
            sum = sum + i;
           // System.out.println(sum);
        }
        //System.out.println(sum);
    }
}
