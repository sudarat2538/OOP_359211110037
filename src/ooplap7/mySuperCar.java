package ooplap7;

import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {
        SuperCar c1 = new SuperCar();
        c1.setBrand("honda");
        c1.setColor("Black");
        c1.setSize("111");
        c1.setMaxspeed("199");
        c1.setRigin("thailand");

        getSuperCarInfo(c1);

        SuperCar c = new SuperCar();
        c = inputData(c);

    }

    private static SuperCar inputData(SuperCar c) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter supercar info:");
        System.out.print("Enter Supercar brand: ");
        c.setBrand(scanner.nextLine());
        System.out.print("Enter Supercar color: ");
        c.setColor(scanner.nextLine());
        System.out.print("Enter Supercar size: ");
        c.setSize(scanner.nextLine());
        System.out.print("Enter Supercar max speed: ");
        c.setMaxspeed(scanner.nextLine());
        System.out.print("Enter Supercar rigin: ");
        c.setRigin(scanner.nextLine());

        return c;
    }


   private static void getSuperCarInfo(SuperCar c1) {
        System.out.println("Brand: "+ c1.getBrand());
        System.out.println("Color: "+ c1.getColor());
        System.out.println("Size: "+ c1.getSize());
        System.out.println("Maxspeed: "+ c1.getMaxspeed());
        System.out.println("Rigin: "+ c1.getRigin());
    }


}//class
