package Demo;
//数组
public class Demo06 {
//静态初始化

    public static void main(String[] args) {
        //1.定义数组存储5个学生的年龄
        int[] arr1 = new int[]{11,12,13,14,15};
        int[] arr2 = {11,12,13,14,15};

        //2.定义的数组储存3个学生的姓名
        String[] arr3 = new String[]{"zs","ls","ww"};
        String[] arr4 = {"zs","ls","wa"};

        //3.定义的数组储存4个学生的身高
        double[] arr5 = new double[]{1.93,1.75,1.83,1.82};
        double[] arr6 = {1.93,1.75,1.83,1.82};

        //System.out.println(arr6);//[D@119d7047 地址值

        //扩展：
        //解释  [D@119d7047
        //[ 表示当前是一个数组
        //D 表示当前数组里面的元素都是double类型的
        //@ 表示一个间隔符号  （固定格式）
        //119d7047  才是数组真正的地址值  （十六进制）
        //平时我们习惯性的会把这个整体叫做数组的地址值。

    }
}
