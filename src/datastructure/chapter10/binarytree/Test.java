package datastructure.chapter10.binarytree;

        /*
                              50
                27                              68
        12              36              55              82
    7      19      **       49      **      **      76      **

         */

import java.util.TreeMap;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        System.out.println("--------------- insert ---------------");

        tree.add(50);
        tree.add(27);
        tree.add(68);
        tree.add(12);
        tree.add(36);
        tree.add(55);
        tree.add(82);
        tree.add(7);
        tree.add(19);
        tree.add(49);
        tree.add(76);

        System.out.println("-------------- traverse --------------");

        // 50 27 12 7 19 36 49 68 55 82 76
        tree.preOrder(tree.getRoot());
        System.out.println();

        // 7 12 19 27 36 49 50 55 68 76 82
        tree.inOrder(tree.getRoot());
        System.out.println();

        // 7 19 12 49 36 27 55 76 82 68 50
        tree.postOrder(tree.getRoot());
        System.out.println();

        System.out.println("---------------- search ----------------");
        Node found = tree.find(27);
        System.out.println(found);
        found = tree.find(100);
        if (found == null) System.out.println("NOT FOUND");

        System.out.println("------------- search min/max -------------");
        tree.add(3);
        tree.add(100);
        Node min = tree.findMin();
        System.out.println(min);
        Node max = tree.findMax();
        System.out.println(max);

        System.out.println("---------------- print tree ----------------");
        tree.delete(82);
        tree.display();

        // 트리의 문제점
        BinaryTree tree2 = new BinaryTree();

        tree2.add(50);
        tree2.add(40);
        tree2.add(30);
        tree2.add(20);

        System.out.println("------------------ 이진 트리의 문제점 -------------------");
        // in this case, this becomes a list -> solution : AVL tree
        tree2.display();

        System.out.println("------------------ API TREE -------------------");

        // TreeSet : Tree as Set --> Sorted
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(77);
        treeSet.add(27);
        treeSet.add(7);
        treeSet.add(67);
        System.out.println(treeSet);

        // TreeMap : Tree as Map --> Sorted (Key)
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Dog", 30);
        treeMap.put("Cat", 55);
        treeMap.put("Bird", 44);
        System.out.println(treeMap);
    }
}












