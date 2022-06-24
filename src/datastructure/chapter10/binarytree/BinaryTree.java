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

    // In Order : 중위 순회 (전중후)
    public void inOrder(Node tempRoot) {
        // 1. 중앙 노드값 출력
        // 2. recursive call to left until there's no child
        // 3. recursive call to right until there's no child
        if (tempRoot != null) {
            inOrder(tempRoot.getLeftChild());
            System.out.printf("%d ", tempRoot.getData());
            inOrder(tempRoot.getRightChild());
        }
    }

    // Post Order : 후위 순회 (전후중)
    public void postOrder(Node tempRoot) {
        if (tempRoot != null) {
            postOrder(tempRoot.getLeftChild());
            postOrder(tempRoot.getRightChild());
            System.out.printf("%d ", tempRoot.getData());
        }
    }

    // ------------- search ------------- //
    public Node find(int targetData) {

        Node current = root;

        while (current.getData() != targetData) {

            // 찾는 값이 현재 노드의 값보다 작은 경우
            if (targetData < current.getData()) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }

            if (current == null) return null; // search failed

        }
        return current; // search success
    }

    // ------------- search min/max ------------- //
    public Node findMin() {
        if (isEmpty()) return null;

        Node current = root;
        while (current.getLeftChild() != null) {
            current = current.getLeftChild();
        }
        return current;
    }

    public Node findMax() {
        if (isEmpty()) return null;

        Node current = root;
        while (current.getRightChild() != null) {
            current = current.getRightChild();
        }
        return current;
    }

    // ------------- delete ------------- //
    public boolean delete(int targetData) {
        // 삭제 노드와 해당 삭제노드의 부모노드를 탐색
        Node current = root;
        Node parent = current;

        while (targetData != current.getData()) {
            if (current == null) return false;

            parent = current;
            if (targetData < current.getData()) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
        }

        // 삭제 진행
        // 삭제 대상노드의 자식이 없는 경우
        if (current.getLeftChild() == null && current.getRightChild() == null) {

            if (current == root) { // 삭제 대상 루트
                root = null;
            } else if (parent.getRightChild() == current) { // 삭제 대상이 부모의 오른쪽 자식이었다면
                parent.setRightChild(null);
            } else {
                parent.setLeftChild(null);
            }

        } else if (current.getRightChild() == null) { // 삭제 대상 노드의 자식이 하나인 경우 - 왼쪽

            // 삭제 대상이 루트
            if (current == root) {
                root = current.getLeftChild();
            } else if (parent.getLeftChild() == current) { // 삭제 대상이 부모의 왼쪽 자식인 경우
                // 부모의 새로운 왼쪽자식으로 삭제대상의 자식을 연결
                parent.setLeftChild(current.getLeftChild());
            } else { // 삭제 대상이 부모의 오른쪽 자식인 경우
                // 부모의 새로운 오른쪽자식으로 삭제대상의 자식을 연결
                parent.setRightChild(current.getLeftChild());
            }

        } else if (current.getLeftChild() == null) { // 삭제 대상 노드의 자식이 하나인 경우 - 오른쪽

            // 삭제 대상이 루트
            if (current == root) {
                root = current.getRightChild();
            } else if (parent.getLeftChild() == current) { // 삭제 대상이 부모의 왼쪽 자식인 경우
                // 부모의 새로운 왼쪽자식으로 삭제대상의 자식을 연결
                parent.setLeftChild(current.getRightChild());
            } else { // 삭제 대상이 부모의 오른쪽 자식인 경우
                // 부모의 새로운 오른쪽자식으로 삭제대상의 자식을 연결
                parent.setRightChild(current.getRightChild());
            }

        } else { // 삭제 대상 노드의 자식이 둘인 경우

            // 삭제 노드를 대체할 후보 노드 찾기
            Node candidate = getCandidate(current);

            if (current == root) {
                root = candidate;
            } else if (current == parent.getLeftChild()) {
                parent.setLeftChild(candidate);
            } else {
                parent.setRightChild(candidate);
            }

            candidate.setLeftChild(current.getLeftChild());
            
        }

        return false;
    }

    // 후보 노드 찾기
    private Node getCandidate(Node deleteNode) {

        Node candidate = deleteNode.getRightChild();

        //  후보 노드는 삭제 노드의 오른쪽 자식 중에 가장 왼쪽 끝에 있는 자식
        while (candidate.getLeftChild() != null) {
            candidate = candidate.getLeftChild();
        }

        return candidate;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node getRoot() {
        return root;
    }
}














