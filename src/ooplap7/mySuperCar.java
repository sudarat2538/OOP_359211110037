package ooplap7;

import java.util.ArrayList;
import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {
        ArrayList<SuperCar> myCarList = new ArrayList<SuperCar>();
        myCarList = inputData(myCarList);
        System.out.println("== Show Super Car Info");
        for (int i = 0; i < myCarList.size(); i++) {
            System.out.println(myCarList.get(i).getSuperCarInfo());
        }
    }


    private static ArrayList inputData(ArrayList myCarList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter supercar info:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Super car: " + (i + 1));
            System.out.print("Enter Supercar brand: ");
            String b = (scanner.nextLine());
            System.out.print("Enter Supercar color: ");
            String c = (scanner.nextLine());
            System.out.print("Enter Supercar size: ");
            String s = (scanner.nextLine());
            System.out.print("Enter Supercar max speed: ");
            String m = (scanner.nextLine());
            System.out.print("Enter Supercar rigin: ");
            String r = (scanner.nextLine());
            SuperCar car = new SuperCar(b, c, s, m, r);
            myCarList.add(car);
        }
            return myCarList;
        }


}//class
