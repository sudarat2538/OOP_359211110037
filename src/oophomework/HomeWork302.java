package oophomework;


import java.util.Scanner;

public class HomeWork302 {
    public static void main(String[] args) {
        int id = getId();
        String name = getName();
        float salary = getSalary();
        float OverTime = getOverTime();
        showData(id, name, salary, OverTime);
    }
    private static int getId() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you ID :");
        int ID = in.nextInt();
        return ID;
    }
    private static String getName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you Name :");
        String name = in.nextLine();
        return name;
    }
    private static float getSalary() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you Salary :");
        float salary = in.nextFloat();
        return salary;
    }
    private static float getOverTime() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you OverTime :");
        float overtime = in.nextFloat();
        return overtime;
    }
    private static int calculatetax(float x,float y){
        float sum=y+x;
        if (sum >=100000) {
            return 10;
        }
        else if (sum>=70000){
            return 7;
        }
        else if (sum>=50000){
            return 5;
        }
        else if (sum>=30000){
            return 3;
        }
        else {
            return 1;
        }
        }
        private static void showData(int id, String name, float salary, float overtime){
        HomeWork302 y = new HomeWork302();
            System.out.println("ID :"+ id);
            System.out.println("Name :"+ name);
            System.out.println("salary :"+ salary);
            System.out.println("OverTime :"+ overtime);
            System.out.println("Tax is :"+ y.calculatetax(salary,overtime)+"%");
    }//main

}//class
