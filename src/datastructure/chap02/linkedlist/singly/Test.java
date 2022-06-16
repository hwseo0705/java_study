package datastructure.chap02.linkedlist.singly;

public class Test {
    public static void main(String[] args) {

        SimpleLinkedList<String> list = new SimpleLinkedList<>();
        list.insert("coffee");
        list.insert("water");
        list.insert("chips");
        System.out.println(list.printList());

        SimpleLinkedList<Double> dList = new SimpleLinkedList<>();
        dList.addFirst(3.5);
        dList.addFirst(5.5);
        dList.addFirst(6.5);
        System.out.println(dList.printList());
    }
}
