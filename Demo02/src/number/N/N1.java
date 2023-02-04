package N;


public class N1 {
    //private String str = "lifangfei";

    public static void main(String[] args) {

//        String s1 = "lifangfei";
//        String s2 = "12345";
//        N1 n1 = new N1();
//        n1.loginUser(s1, s2);

        char[] demos = {'l','f','f'};

        String str = new String(demos);
        System.out.println(str.length());
        System.out.println(str);
    }

        //用户登录
        public int loginUser(String username,String password){
            String username_succ = "lifangfei";
            String password_succ = "123456";

            if (username == username_succ && password == password_succ) {
                System.out.println("登陆成功");
                return 1;
            }else {
                System.out.println("登陆失败！请检测账号密码");
                return 0;
            }
        }

        //更改地址
        public static void loAcl(String address,boolean flag) {
            String address_a = "xxxxxx";
            if (flag) {
                System.out.println("我的地址" + address_a);
            }else {
                System.out.println("我的地址" + address_a);
            }

        }

    }

