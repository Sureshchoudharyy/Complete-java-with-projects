import java.sql.SQLOutput;

public class Student {
    String name;
    int rollNo;
    String course;
    String email;
    String address;
    String gender;

    public Student(){
        this("unknown",0,"unknown","unknown");
    }

    public Student(String name,int rollNo,String course,String email){
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
        this.email = email;
    }

    public Student(String name, String gender, String address){
        this.name = name;
        this.gender = gender;
        this.address = address;
    }


    public void details(){
        System.out.println(name+" is the student of SKIT and roll no. is "+rollNo+" and course is taken by the student is "+course+" and this is the college mail id given to the student "+email);
    }

    public void personal(){
        System.out.println(name+" - "+gender+" - "+address);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Suresh",106,"CSE","b210505@skit.ac.in");
        s1.details();

        Student s2 = new Student("Suresh","Male","Jaipur");
        s2.personal();
    }
}
