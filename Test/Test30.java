package Test;
/*定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处*/
public class Test30 {
    public static void main(String[] args) {

        int[] arr = {1,3,5,4,7,35,65,6};

        boolean flag = contains(arr,89);

        System.out.println(flag);

    }

    public static boolean contains(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return true;
            }
        }

        return false;
    }
}

//return break 关键字的区别
//return ：其实跟循环没有什么关系，跟方法有关的，表示1结束方法 2 返回结果
//      如果方法执行到return， 那么整个方法全部结束，里面的循环也结束