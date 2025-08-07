package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=6;i++){
            list.add(i);
        }
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
