package ArrayListDemo;

import java.util.ArrayList;

/*
* 需求：
* 定义JavaBean类： phone
* phone属性： 品牌，价格
* main方法中定义一个集合，存入三个手机对象
* 分别为：小米 1000，苹果，8000，锤子，2999
* 定义一个方法：将价格低于3000的手机信息"返回"
*                                   "返回"： 如果我们要返回多个数据，可以把这些数据先放到一个容器当中，再把容器返回
* */
public class ArrayListTest8 {
    public static void main(String[] args) {

        //1.创建集合对象
        ArrayList<Phone_8> list = new ArrayList<>();

        //2.创建手机的对象
        Phone_8 p1 = new Phone_8("小米",1000);
        Phone_8 p2 = new Phone_8("苹果",8000);
        Phone_8 p3 = new Phone_8("锤子",2999);

        //3.添加数据
        list.add(p1);
        list.add(p2);
        list.add(p3);

        //4.调用方法
        ArrayList<Phone_8> phoneInfoList = getPhoneInfo(list);

        //5.遍历集合
        for (int i = 0; i < phoneInfoList.size(); i++) {
            Phone_8 phone = phoneInfoList.get(i);
            System.out.println(phone.getBrand() + "，" + phone.getPrice());
        }

    }


    public static ArrayList<Phone_8> getPhoneInfo(ArrayList<Phone_8> list){
        //定义一个集合用于存储价格低于3000的手机对象
        ArrayList<Phone_8> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone_8 p = list.get(i);
            int price = p.getPrice();
            //如果当前手机价格低于3000，那么就把手机对象添加到resultList
            if (price < 3000){
                resultList.add(p);

            }

        }
        return resultList;

    }

}
