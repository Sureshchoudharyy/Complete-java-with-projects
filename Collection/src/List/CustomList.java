package List;

import java.util.ArrayList;
import java.util.List;

class Student{
    int id;
    String name;
    String course;

    Student(int id,String name,String course){
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "{ id : "+id+" | name : "+name+" | course : "+course+" }";
    }
}
public class CustomList {
    public static void main(String[] args) {
        Student s1 = new Student(1,"suresh","Java");
        Student s2 = new Student(2,"suman","C++");
        Student s3 = new Student(3,"vijay","Gate");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);
    }
}
