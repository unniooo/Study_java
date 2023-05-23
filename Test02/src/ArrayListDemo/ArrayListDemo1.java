package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //1 创建集合对象
        ArrayList<String> list = new ArrayList<>();

        //2.添加元素
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //3.删除元素
        /*boolean result1 = list.remove("aaa");
        System.out.println(result1);

        boolean resulr2 = list.remove("ddd");
        System.out.println(resulr2);

        String str = list.remove(2);
        System.out.println(str);*/


//        //修改元素
//        String result = list.set(1,"ddd");
//        System.out.println(result);

//        //查询元素
//        String s = list.get(0);
//        System.out.println(s);

        //遍历元素
        for (int i = 0; i < list.size(); i++) {
            //i 索引
            //list.get（i） 元素
            String str = list.get(i);
            System.out.println(str);

        }



        System.out.println(list);
    }
}
