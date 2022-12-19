public class Fruits {

    private String name;  //名称
    private String shape;  //形状
    private String color;  //颜色
    private String growthCycle;  //生长周期

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getGrowthCycle() {
        return growthCycle;
    }

    public void setGrowthCycle(String growthCycle) {
        this.growthCycle = growthCycle;
    }


    public void taste() {
        System.out.println("酸甜");
    }
}
