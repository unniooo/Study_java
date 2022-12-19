public class Test1 {

    public static void main (String[] args){
        funMain();
    }

    static int funMain(){
        System.out.println("HelloWorld");
        return 0;

    }

    static public int testMain(){

        System.out.println("public");
        return 0;
    }

    static protected int testMain01(){

        System.out.println("public");
        return 0;
    }

    static private int testMain02(){

        System.out.println("public");
        return 0;
    }


}
