package Test;

public class Test26 {
    public static void main(String[] args) {

        //定义方法，用来比较两个长方形的面积
        //需求： 定义方法，比较两个长方形的面积

        double area1 = getArea(5.3,1.7);
        double area2 = getArea(6.3,2.7);

        if (area1 > area2){
            System.out.println("第一个长方形大");
        }else {
            System.out.println("第二个长方形大");
        }

    }



    public static double getArea(double len,double width) {
        double area = len * width;
        return area;

    }



//    public static void compare(double len1,double width1,double len2,double width2){
//        double area1 = len1 * width1;
//        double area2 = len2 * width2;
//
//        if (area1 > area2){
//            System.out.println("第一个大");
//        }else {
//            System.out.println("第二个大");
//        }
//    }

}
