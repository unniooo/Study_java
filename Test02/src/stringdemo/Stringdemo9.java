package stringdemo;

import java.util.Scanner;

//金额转换  (转换数字 -> 前面补0 -> 插入单位 )
public class Stringdemo9 {
    public static void main(String[] args) {
        //1.键盘录入一个金额
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入一个金额：");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            }else {
                System.out.println("金额无效");
            }
        }

        //定义一个变量用来表示钱的大写
        String moneyStr = "";
        //2.得到money里面的每一个数字,转成中文
        while (true) {//123
            //从右往左获取数据，因为右侧是数据的个位
            int ge = money % 10;
            String capitalNumber = getCapitalNumber(ge);
            //System.out.println(capitalNumber);
            //把转换之后的大写拼接到moneyStr当中
            moneyStr = capitalNumber +  moneyStr;
            //去掉刚刚获取的数据
            money = money / 10;

            //如果数字上的每一位数字全部获取到了，那么money记录的就是0，此时循环结束

            if (money == 0) {
                break;
            }
        }

        //3.在前面补0，补全7位
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }

        System.out.println(moneyStr);

        //4.插入单位
        //定义一个数组表示单位
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};

        //遍历moneyStr
        //把arr 的单位插进去

        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];
        }
        //用打印的方法
//        for (int i = 0; i < moneyStr.length(); i++) {
//            char c = moneyStr.charAt(i);
//            System.out.print(c);
//            //打印单位
//            System.out.print(arr[i]);
//        }

        System.out.println(result);

    }
    public static String getCapitalNumber(int number){
        //定义数组 让数字和大写中文产生一个对应关系
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        //返回结果
        return arr[number];

    }


}
