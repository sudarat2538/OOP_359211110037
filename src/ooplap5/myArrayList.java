package ooplap5;

import java.util.ArrayList;

public class myArrayList {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        //add method
        myList.add("NUK");
        System.out.println(myList);
        myList.add("TAN");
        myList.add("BOW");
        System.out.println(myList);
        System.out.println(myList.size());
        myList.add(2,"Hello");
        System.out.println(myList);
        myList.add(1,100);
        System.out.println(myList);
        myList.set(0,"Sudarat");
        System.out.println(myList);
        myList.remove("Hello");
        System.out.println(myList);
        System.out.println(myList.indexOf(100));
    }//main
}//class
