package datastructure.chapter10.binarytree;

class Node {
    private int data;
    private Node leftChild;
    private Node rightChild;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public String toString() {
        return String.format("[ %d ]", data);
    }
}

public class BinaryTree {

    private Node root;

    // ------------- insert ------------- //
    public void add(int data) {
        // 삽입할 데이터 노드 생성
        Node newNode = new Node(data);

        // if tree is empty, set root node
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;

            while (true) {
                parent = current;
                // 삽입할 데이터가 타겟노드의 데이터보다 작은경우
                if (data < current.getData()) {
                    current = current.getLeftChild();
                    if (current == null) {
                        parent.setLeftChild(newNode);
                        return;
                    }
                } else { // 큰경우
                    current = current.getRightChild();
                    if (current == null) {
                        parent.setRightChild(newNode);
                        return;
                    }
                }
            }
        }

    }

    // ------------- traverse ------------- //

    // PreOrder : 전위 순회 (중전후)
    public void preOrder(Node tempRoot) {
        // 1. 중앙 노드값 출력
        // 2. recursive call to left until there's no child
        // 3. recursive call to right until there's no child
        if (tempRoot != null) {
            System.out.printf("%d ", tempRoot.getData());
            preOrder(tempRoot.getLeftChild());
            preOrder(tempRoot.getRightChild());
        }
    }




}














