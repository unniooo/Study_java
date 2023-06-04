package a03oopextensdemo3;

public class Student extends Person{
    //子类构造方法中隐藏的super（）去访问父类的无参构造
    public Student(){
        super();
        System.out.println("子类的无参构造");
    }


}
