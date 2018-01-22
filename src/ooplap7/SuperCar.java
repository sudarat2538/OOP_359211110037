package ooplap7;

public class SuperCar {
    private String brand;
    private String color;
    private String size;
    private String maxspeed;
    private String rigin;

    public SuperCar (){}
    public SuperCar(String b, String c, String s, String m, String r) {
        this.brand = b;
        this.color = c;
        this.size = s;
        this.maxspeed = m;
        this.rigin = r;

    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }
    public String getMaxspeed() { return maxspeed; }
    public void setMaxspeed(String maxspeed) { this.maxspeed = maxspeed; }
    public String getRigin() { return rigin; }
    public void setRigin(String rigin) { this.rigin = rigin; }


}//class
