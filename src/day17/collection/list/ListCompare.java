package day17.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ArrayList is fast when getting the data
// LinkedList is fast when inserting/deleting data
public class ListCompare {
    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        List<Integer> linked = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            array.add(i);
            linked.add(i);
        }

        long s, e; // start and end time

        // control data from ArrayList
        s = System.currentTimeMillis();
        int len = array.size();
        for (int i = 0; i < len; i++) {
            // array.remove(0); // 654ms
            array.get(i); // 2ms
        }
        e = System.currentTimeMillis();
        System.out.printf("Array List Remove Time : %dms\n", e - s);

        // control data from LinkedList
        s = System.currentTimeMillis();
        len = linked.size();
        for (int i = 0; i < len; i++) {
            // linked.remove(0); // 0ms
            linked.get(i); // 3801ms
        }
        e = System.currentTimeMillis();
        System.out.printf("Linked List Remove Time : %dms\n", e - s);
    }
}
