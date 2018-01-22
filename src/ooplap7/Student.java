package ooplap7;


public class Student {
 private String id;
 private String name;
 private String major;
 private String group;

 //constructor การสร้างชื่อที่มีชื่อเดียวกับชื่อคลาส
    public Student (){}
    public Student(String id,String n,String m,String g) {
        this.id = id;
        this.name = n;
        this.major = m;
        this.group = g;
    }// constructor

    //getter and setter methods
    //id
    public void setId(String id){
        this.id = id;
    }//setID ใช้ในการเปลี่ยนแปลงค่าข้อมูล
    public String getId(){
        return this.id;
    }//getID
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public String getMajor(){
        return this.major;
    }
    public void setGroup(String group){
        this.group = group;
    }
    public String getGroup(){
        return this.group;
    }







}//class
