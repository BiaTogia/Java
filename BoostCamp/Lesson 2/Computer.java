package OOP;

public class Computer {
    private String name;
    private String model;
    private String ram;
    private String cpu;
    private String memory;
    private String graphicsCardCapacity;
    private double price;
    private double discountPercent = 0.0;
    private double discount = 0.0;
    private double coupon = 0.0;

    public void addToWishList(){
        System.out.println("Added to wish list");
    }
    static void showDiscount(double price,double discountPercent,double coupon,double discount){
        double lastPrice = price - price*discountPercent/100;
        lastPrice = lastPrice - coupon;
        lastPrice = lastPrice - discount;
        System.out.println(lastPrice);
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getRam(){
        return ram;
    }
    public void setRam(String ram)
    {
        this.ram = ram;
    }
    public String getCpu(){
        return cpu;
    }
    public void setCpu(String cpu){
        this.cpu = cpu;
    }
    public String getMemory(){
        return memory;
    }
    public void setMemory(String memory){
        this.memory = memory;
    }
    public String getGraphicsCardCapacity(){
        return graphicsCardCapacity;
    }
    public void setGraphicsCardCapacity(String graphicsCardCapacity){
        this.graphicsCardCapacity = graphicsCardCapacity;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getDiscountPercent(){
        return discountPercent;
    }
    public void setDiscountPercent(double discountPercent){
        this.discountPercent = discountPercent;
    }
    public double getDiscount(){
        return discount;
    }
    public void setDiscount(double discount){
        this.discount = discount;
    }
    public double getCoupon(){
        return coupon;
    }
    public void setCoupon(double coupon){
        this.coupon = coupon;
    }
}
