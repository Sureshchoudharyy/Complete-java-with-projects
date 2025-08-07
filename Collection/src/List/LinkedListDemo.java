package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        System.out.println(list);
        int x = list.get(2);
        System.out.println(x);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int data = it.next();
            System.out.println(data);
        }
    }
}
