package Test3_10;

public class PhoneTest {
    public static void main(String[] args) {

        //1.创建一个数组
        Phone[] arr = new Phone[3];

        //2.创建手机的对象
        Phone p1 = new Phone("小米",1999,"白色");
        Phone p2 = new Phone("华为",19999,"绿色");
        Phone p3 = new Phone("oppo",999,"蓝色");

        //3.把手机对象添加到数组中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        //4.获取三部手机的平均价格
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //i  索引 arr[i] 元素（手机对象）
            Phone phone = arr[i];
            sum = sum + phone.getPrice();
        }

        //5.求平均值
        //数据能不写死就不写死
        int avg = sum / arr.length;

        //double avg2 = sum * 1.0 / arr.length;  //有小数



        System.out.println(avg);

    }
}
