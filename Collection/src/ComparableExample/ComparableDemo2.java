package ComparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student(18,"virat");
        Student s2 = new Student(45,"rohit");
        Student s3 = new Student(7,"dhoni");

        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list);
        System.out.println(list);
    }
}
