package a02polymorphismdemo2;

public class Test {
    public static void main(String[] args) {
        //创建对象并调用方法

        /*Person p1 = new Person("老王",30);
        Dog d = new Dog(2,"黑色");
        p1.keepPet(d,"骨头");


        Person p2 = new Person("老李",25);
        Cat c = new Cat(3,"灰");
        p2.keepPet(c,"鱼");
*/

        //创建饲养员的对象
        Person p = new Person("老王",30);
        Dog d = new Dog(2,"黑色");
        Cat c = new Cat(3,"灰");
        p.keepPet(d,"骨头");
        p.keepPet(c,"骨头");
    }
}
