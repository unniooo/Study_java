package a01oopextensdemo1;

public class Animal {

    //权限修饰符
    //private ： 子类就无法访问了
    //私有的只能在本类中使用

    public void eat(){
        System.out.println("吃东西");
    }

    public void drink(){
        System.out.println("喝水");
    }
}
