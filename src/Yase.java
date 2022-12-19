public class Yase {

    enum Pf{First,Second,Third,Forth}
    Pf tyqes;
    public int gjl = 1000;
    public int wl = 800;
    public int fy = 1000;
    public Pf ys_pf;
    //技能一
    public void funFirst(){
        System.out.println("亚瑟第一个技能发动");
    }

    //技能二
    public void funSecond(){
        System.out.println("亚瑟第二个技能发动");
    }
    //技能三
    public void funThird(){
        System.out.println("亚瑟第三个技能发动");
    }
    public static void main(String[] args){
        Yase yase = new Yase();
        yase.ys_pf = Pf.Second;
    }
}
