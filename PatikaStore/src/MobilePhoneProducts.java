public class MobilePhoneProducts {
    private int id;
    private String name;
    private double price;
    private int discountRate;
    private int stock;
    private double screenSize;
    private int ram;
    private int memory;
    private BrandList brand;
    private int battery;
    private String color;


    public MobilePhoneProducts(){}

    public MobilePhoneProducts(int id, String name, double price, int discountRate, int stock, double screenSize, int ram,
                               int memory, BrandList brand, int battery, String color) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.stock = stock;
        this.screenSize = screenSize;
        this.ram = ram;
        this.memory = memory;
        this.brand = brand;
        this.color = color;
        this.battery = battery;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public BrandList getBrand() {
        return brand;
    }

    public void setBrand(BrandList brand) {
        this.brand = brand;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

