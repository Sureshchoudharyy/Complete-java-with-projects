package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(2);
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.size());
        list.remove(2);
        System.out.println(list);
        list.add(2,10);
        System.out.println(list);
        System.out.println(list.isEmpty());
    }
}
