package cals;
//计算器
public class Calcu {
    float num1;
    float num2;

    public void add(float num1, float num2) {
        System.out.println("加法");
        float total = num1 + num2;
//       boolean state;
//        if(total==11){
//            state = true;
//        }else{
//            state = false;
//        }
//        if(state){
//            System.out.println("加法计算正确");
//        }else{
//            System.out.println("加法计算错误");
//        }
        System.out.println("加法结果是:" + total);
    }

    public void jianFa(float num1, float num2) {
        System.out.println("减法");
        float total = num1 - num2;
        System.out.println("减法结果是:" + total);
    }

    public void chuFa(float num1, float num2) {
        System.out.println("除法");
        double total = (float) num1 / (float) num2;
        System.out.println("除法结果是:" + total);
    }

    public void chenFa(float num1, float num2) {
        System.out.println("乘法");
        float total = num1 * num2;
        System.out.println("乘法结果是:" + total);
    }

    public void N_chenfa(float num1, float num2) {
        System.out.println("次方运算");
        int n = (int) num2;
        float res = 1.0f;
//        do {
//            res = res*num1;
//            n = n-1;
//        } while (n!=-1&&res<=2147483647.0f&&res>=-2147483648.0f);
//        if(n!=-1){
//            System.out.println("数据异常无法计算");
//        }
        for (int j = 1; j <= n; j++) {
            res = res * num1;
            if (res <= 2147483647.0f && res >= -2147483648.0f) {
            } else {
                System.out.println("数据异常无法计算");
            }

        }  System.out.println(num1 + "的" + num2 + "次方是：" +(int) res);
    }
}
