package Test3_05;

public class Student {
    private  String name;
    private  int age;


    public Student(){
        System.out.println("?");
    }


    public Student(String name,int age){
        this.name = name;
        this.age = age;

    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int gerAge(){
        return age;
    }

    public void setName(int age){
        this.age = age;
    }



}
