package ComparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee e1 = new Employee(11,"rohit","IT");
        Employee e2 = new Employee(1,"virat","IT");
        Employee e3 = new Employee(44,"dhoni","IT");

        list.add(e1);
        list.add(e2);
        list.add(e3);

        Collections.sort(list, new Employee());
        System.out.println(list);
    }
}
