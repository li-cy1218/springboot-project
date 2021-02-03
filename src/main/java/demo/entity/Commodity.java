package demo.entity;

public class Commodity {

    private Integer id;

    private String brand;

    private String commodityMessage;

    private String commodityImage;

    private String shop;

    private String email;

    private String type;

    private String sex;

    public Integer getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCommodityMessage() {
        return commodityMessage;
    }

    public void setCommodityMessage(String commodityMessage) {
        this.commodityMessage = commodityMessage;
    }

    public String getCommodityImage() {
        return commodityImage;
    }

    public void setCommodityImage(String commodityImage) {
        this.commodityImage = commodityImage;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
