package Test;

public class Test27 {
    public static void main(String[] args) {

        //调用
        compare((byte) 10,(byte) 20);

        byte b1 = 10;
        byte b2 = 20;
        compare(b1,b2);


    }


    //会把相同功能的方法名起成一样的名字
    public static void compare(byte b1, byte b2){
        System.out.println("byte");
        System.out.println(b1 == b2);

    }

    public static void compare(short s1, short s2){
        System.out.println("short");
        System.out.println(s1 == s2);

    }

    public static void compare(int i1, int i2){
        System.out.println("int");
        System.out.println(i1 == i2);

    }

    public static void compare(long l1, long l2){
        System.out.println("long");
        System.out.println(l1 == l2);

    }
}
