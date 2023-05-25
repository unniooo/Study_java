package ArrayListDemo;

import java.util.ArrayList;

/*
* 需求
* 1.main方法中定义一个集合，存入三个用户对象
* 用户属性为： id username password
* 2.要求： 定义一个方法，根据id查找对应的用户信息
* 如果存在，返回true
* 如果不存在，返回false*/
public class ArrayListTest6 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<User_6> list = new ArrayList<>();

        //2.创建三个用户对象
        User_6 u1 = new User_6("001","Zhangsan","123456");
        User_6 u2 = new User_6("002","lisi","1234567");
        User_6 u3 = new User_6("003","wangwu","12345678");

        //3.把用户对象添加到集合中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //4.调用方法查看id是否存在
        boolean flag = contains(list,"009");

        //5.打印结果
        System.out.println(flag);

    }

    public static boolean contains(ArrayList<User_6> list, String id){
        for (int i = 0; i < list.size(); i++) {
            //list.get(i).getId().equals(id);
            User_6 u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)){
                return true;
            }
        }
        return false;
    }



}
