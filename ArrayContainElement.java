package Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayContainElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(11);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("List is : "+list);

        int key = 11;
        if (list.contains(key)) {
            System.out.println("Element "+ key + " Present array");
        }else {
            System.out.println("Element "+ key + " Not Present array");
        }
    }
}
