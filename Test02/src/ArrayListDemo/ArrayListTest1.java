package ArrayListDemo;

//添加字符串

import java.util.ArrayList;

public class ArrayListTest1 {
    public static void main(String[] args) {
        //1 创建集合对象
        ArrayList<String> list = new ArrayList<>();

        //2.添加元素
        list.add("一二三");
        list.add("四五六");
        list.add("七八九");
        list.add("十");

        //3.遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.println("]");
    }
}
