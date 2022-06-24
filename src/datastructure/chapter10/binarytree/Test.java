package datastructure.chapter10.binarytree;

        /*
                              50
                27                              68
        12              36              55              82
    7      19      **       49      **      **      76      **

         */

public class Test {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // ------------- insert ------------- //

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

        // ------------- traverse ------------- //

        // 50 27 12 7 19 36 49 68 55 82 76
        tree.preOrder(tree.getRoot());
        System.out.println();

        // 7 12 19 27 36 49 50 55 68 76 82
        tree.inOrder(tree.getRoot());
        System.out.println();

        // 7 19 12 49 36 27 55 76 82 68 50
        tree.postOrder(tree.getRoot());
        System.out.println();

        // ------------- search ------------- //
        Node found = tree.find(27);
        System.out.println(found);
        found = tree.find(100);
        if (found == null) System.out.println("NOT FOUND");

        // ------------- search min/max ------------- //
        tree.add(3);
        tree.add(100);
        Node min = tree.findMin();
        System.out.println(min);
        Node max = tree.findMax();
        System.out.println(max);

    }
}
