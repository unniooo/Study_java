package hero;

public class Gongben {
    String name;
    String sex;
    float gjl;
    float fyl;
    int booldnum;
    boolean isopen = true;

    public Gongben(String name, String sex, float gjl, float fyl, int booldnum) {
        this.name = name;
        this.sex = sex;
        this.gjl = gjl;
        this.fyl = fyl;
        this.booldnum = booldnum;

    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public float getGjl() {
        return gjl;
    }

    public float getFyl() {
        return fyl;
    }

    public int getBooldnum() {
        return booldnum;
    }

    public boolean isIsopen() {
        return isopen;
    }

    public void firstaction(){
        System.out.println("**********************************");
        System.out.println(this.name+"发动了一技能");
        this.gjl = this.gjl+300.0f;
        this.fyl = this.fyl+300.0f;
        System.out.println("当前"+this.name+"攻击力为"+this.gjl);
        System.out.println("当前"+this.name+"防御力为"+this.gjl);
        System.out.println("**********************************");
    }

    public void secondaction(){
        System.out.println("**********************************");
        System.out.println(this.name+"发动了二技能");
        this.gjl = this.gjl+300.0f;
        this.fyl = this.fyl+500.0f;
        System.out.println("当前"+this.name+"攻击力为"+this.gjl);
        System.out.println("当前"+this.name+"防御力为"+this.gjl);
        System.out.println("**********************************");

    }

    public void thirdaction(){
        System.out.println("**********************************");
        System.out.println(this.name+"发动了三技能");
        this.gjl = this.gjl+900.0f;
        this.fyl = this.fyl+100.0f;
        System.out.println("当前"+this.name+"攻击力为"+this.gjl);
        System.out.println("当前"+this.name+"防御力为"+this.gjl);
        System.out.println("**********************************");

    }

    public void beidong(){
        while (this.isopen){
            if(this.booldnum<1000){
                System.out.println(this.name+"现在触发被动中");
                this.booldnum = this.booldnum+1000;
                this.isopen = false;
                System.out.println(this.name+"当前血量"+this.booldnum);
            }else{
                System.out.println(this.name+"现在满血");
            }
        }

    }

    public void kouXue(float num){
        System.out.println(this.name+"被打");
        this.booldnum = this.booldnum-(int)num/2;
        if(this.booldnum<0){
            System.out.println(this.name+"死亡"+"，游戏结束");
        }
        System.out.println(this.name+"当前血量:"+this.booldnum);
    }

    public void norAction(){
        System.out.println(this.name+"平A…………");
    }
}

