package ooplap9;

import ooplap8.Pet;

public class Cow extends Pet{
    public Cow(String name, String hairColor, String gender, int age) {
        super(name, hairColor, gender, age);
    }

    @Override
    protected void makeNoise() {
        System.out.println("Mor Mor !!!");
    }
}//class
