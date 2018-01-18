package oophomework;

import java.util.Scanner;

public class HomeWork301 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HomeWork301 y = new HomeWork301();
        for (int i = 1; i < 4; i++) {
            System.out.print("Enter year " + i + " :");
            int a = in.nextInt();
            System.out.println("Age" + i + ": " + y.formula(a));
        }
        System.out.println("Thank you.");
    }
    public int formula(int y){
        int sum;
        return sum = 2561-y;

    }//main

}//class
