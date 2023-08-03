package a02interfacedemo2;

public class basketballSporter extends Sporter{

    public basketballSporter() {
    }

    public basketballSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("蓝球运动员在学习打篮球");
    }
}
