package datastructure.chap02.linkedlist.singly;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();

//        for (int i = 0; i < 6; i++) {
//            list.insert( (int) (Math.random() * 45 + 1));
//        }
        list.insert(3);
        list.insert(1);
        list.insert(8);
        list.insert(11);
        list.insert(5);
        list.insert(7);
        list.insert(14);

        list.remove(5);
        list.remove(8);
        list.remove(11);
        System.out.println(list.printList());


        System.out.println("---------------------------------------------");

        // linked list
        LinkedList linkedList = new LinkedList();

        // add data
        linkedList.add(3);
        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(21);

        // remove data
        linkedList.remove(3);

        System.out.println(linkedList);
    }
}
