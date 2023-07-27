package a02polymorphismdemo2;

public class Dog extends Animal{

    //空参构造
    //带全部参数的构造
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    //行为


    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的"+ getColor() + "颜色的狗两只前腿死死的抱住" + something + "猛吃");
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }

}
