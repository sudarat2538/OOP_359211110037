package ooplap8;

public class Dog extends Pet { //เออเร่อ กด ออติเนส เอ็นเตอ เลือกตัวแรก

    public Dog(String name, String hairColor, String gender, int age) {
        super(name, hairColor, gender, age); //super การเรียกใช้งานจาก superclass Pet
    }
    //กด ออติเนส อินเสิด เลือกOverride
    @Override
    public void makeNoise() {
        System.out.println("Box Box !!!");
    }
}//class
