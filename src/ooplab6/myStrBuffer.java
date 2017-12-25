package ooplab6;

public class myStrBuffer {
    public static void main(String[] args) {
        //StringBuffer
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append(" ");
        buffer.append("to");
        buffer.append(" ");
        buffer.append("RMUTSV");
        buffer.append(" ");
        buffer.append(2017);
        System.out.println(buffer);//ต่อข้อความ
        buffer.replace(0,5,"University of"); //เปลี่ยนข้อความ
        System.out.println(buffer);
        System.out.println(buffer.reverse());//สลับข้อความจากหลังไปหน้า
        buffer.setCharAt(0,'T');//ลบตัวอักษร
        System.out.println(buffer);


    }//main
}//class
