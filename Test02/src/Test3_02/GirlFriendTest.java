package Test3_02;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.name = "xiaoff";
        gf1.age = 18;
        gf1.gender = "meizi";

        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.gender);

        gf1.eat();
        gf1.sleep();

        
        System.out.println("=============");

        GirlFriend gf2 = new GirlFriend();
        gf2.name = "ll";
        gf2.age = 17;
        gf2.gender = "meizi";

        System.out.println(gf2.name);
        System.out.println(gf2.age);
        System.out.println(gf2.gender);


        gf2.eat();
        gf2.sleep();

    }
}
