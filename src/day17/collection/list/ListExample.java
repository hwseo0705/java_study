package day17.collection.list;

import utility.Util;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        // 'List' is an interface
        // Have to create an object of the class that implements 'List'
        // ArrayList : initial size 10, dynamic resize
        List<String> sList = new ArrayList<>(); // or new LinkedList<>();

        // add(E e) : add at the end of the list
        // lists can have duplicate values
        sList.add("Doggo");
        sList.add("Catto");
        sList.add("Birdo");
        sList.add("Frogo");
        sList.add("Catto");
        sList.add("Deero");

        System.out.println(sList);

        // size() : size of the list (not the initial size)
        int size = sList.size();
        System.out.println("size = " + size);

        // add(int index, E e) : insert in that index, push rest
        sList.add(2, "Tigero");
        System.out.println(sList);

        // set(index, obj) : modify object (replace)
        sList.set(3, "Damno");
        System.out.println(sList);

        // remove(index), remove(obj)
        sList.remove(0); // kinda like pop, remove and return
        sList.remove("Damno");
        System.out.println(sList);

        // get(index) : get that index
        String s = sList.get(1); // kinda like peek, return the copy
        System.out.println("get(1) = " + s);

        // indexOf(obj) : get the index of an obj, or -1
        int idx = sList.indexOf("Tigero");
        System.out.println("Index Tigero = " + idx);

        // contains(obj): weather the obj exists
        boolean flag = sList.contains("GrassHopper");
        System.out.println("flag = " + flag);

        Util.line();
        // loop list
        for (int i = 0; i < sList.size(); i++) {
            System.out.println(sList.get(i));
        }

        Util.line();
        for (String s1 : sList) {
            System.out.println(s1);
        }

        // clear() : clear the list content, list object still exists
        sList.clear();
        System.out.println(sList);
        System.out.println(sList.size());
        System.out.println(sList.isEmpty());
    }
}
