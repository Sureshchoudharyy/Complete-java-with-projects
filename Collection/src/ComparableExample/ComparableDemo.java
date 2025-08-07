package ComparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(4);
        list.add(1);
        list.add(6);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
