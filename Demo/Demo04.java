package Demo;

public class Demo04 {
    //switch的简化，
    public static void main(String[] args) {
/*        int number = 1;
        switch (number){
            case 1:
                System.out.println("一");
                break;
            case 2:
                System.out.println("二");
                break;
            case 3:
                System.out.println("三");
                break;
        }*/
        int number = 10;
        switch (number){
            /*case 1 ->{
                System.out.println("一");
            }
            case 2 ->{
                System.out.println("二");
            }
            case 3 ->{
                System.out.println("三");
            }
            default -> {
                System.out.println("没有这种选项");
            }*/
            //代码只有一行大括号可以省略
            case 1 -> System.out.println("一");
            case 2 -> System.out.println("二");
            case 3 -> System.out.println("三");
            default -> System.out.println("没有这种选项");

        }

    }
}
