package ooplab6;

import java.util.StringTokenizer;

public class myStrToken {
    public static void main(String[] args) {
        //StringTokenizer นับจำนวนคำที่อยู่ในข้อความ
        String msg = "Welcome to RMUTSV";
        StringTokenizer myToken = new StringTokenizer(msg);
        System.out.println(myToken.countTokens());

        while (myToken.hasMoreTokens()){
            StringBuffer myBuff = new StringBuffer(myToken.nextToken());
            System.out.print(myBuff.reverse()+" ");
        }


    }//main
}//class
