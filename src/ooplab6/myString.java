package ooplab6;

public class myString {
    public static void main(String[] args) {
        String msg1 = "Sudarat Thongkaew";
        System.out.println(msg1);
        char[] c = {'H', 'e', 'l', 'l', 'o'};
        String msg2 = new String(c);
        System.out.println(msg2);
        //concatination String
        //type 1 (+)
        String msg3 = msg2 +" "+ msg1;//ข้อความมารวมกัน
        System.out.println(msg3);
        System.out.println(msg3.length());//นับอักขระ
        //type 2 (concat())
        String msg4 = msg3.concat(" RMUTSV");//ต่อท้าย
        System.out.println(msg4);

        System.out.println(msg4.toLowerCase());//พิมใหญ่
        System.out.println(msg4.toUpperCase());//พิมเล็ก
        System.out.println(msg4.substring(5,10));//ตัดตัวอักษร

        //trim()ตัดสเปกบาทางซ้ายและขวาทิ้ง
        String msg5 = " Hello ";
        System.out.println("*"+msg5+"*");
        System.out.println("*"+msg5.trim()+"*");

    }//main
}//class
