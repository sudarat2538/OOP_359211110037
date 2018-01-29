package ooplap8;

public abstract class Shape {
    private int width; //กว้าง
    private int length; //ยาว

    public abstract double getArea(); //เออเร่อ กดออติเนสเอ็นเตอ เลือกตัวที่สอง

    public Shape(int width, int length) {
        this.width = width;
        this.length = length;

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


}//Shape

