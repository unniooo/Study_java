package ArrayListDemo;

public class Phone_8 {
    //phone属性 品牌 价格
    private String brand;
    private int price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Phone_8(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public Phone_8(String brand) {
        this.brand = brand;
    }
}
