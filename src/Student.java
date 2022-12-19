public class Student {
    private String name;
    private String sex;  //男女
    private float height;  //身高
    private Long studentNumber;  //学号
    private String sfz;  //身份证
    private Boolean is_girlorboy;  //是否单身
    private int class_id;  //班级编号

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz;
    }

    public Boolean getIs_girlorboy() {
        return is_girlorboy;
    }

    public void setIs_girlorboy(Boolean is_girlorboy) {
        this.is_girlorboy = is_girlorboy;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    static public void eatFood(){
        System.out.println("吃饭");
    }
    static public void sleepDay(){
        System.out.println("睡觉");
    }
    public void playGame(){
        System.out.println("打游戏");
    }

    public void workDay(){
        System.out.println("工作");
    }
}
