package datastructure.chap02.linkedlist.doubly;

public class DoublyLinkedList {
    private SentinelNode sentinel;

    public DoublyLinkedList() {
        sentinel = new SentinelNode();
    }

    // 리스트에 노드를 추가하는 Method
    // a method that adds a node to the list
    public void add(int data) {
        // create a new node
        Node newNode = new Node(data);

        // search insert index
        Node current = sentinel.getFirstNode();
        Node prev = null;
        while (current != null && data > current.getData()) {
            prev = current;
            current = current.getNextNode();
        }

        // link
        // if the list is empty
        if (sentinel.isEmpty()) {
            sentinel.setFirstNode(newNode);
            sentinel.setLastNode(newNode);
        }
        // first insert : 새 노드가 맨 처음 위치에 삽입
        else if (sentinel.getFirstNode() == current) {
            // 새로운 노드의 다음 노드로 기존 첫 노드를 설정
            newNode.setNextNode(sentinel.getFirstNode());
            sentinel.setFirstNode(newNode);
        }
        // last insert : 새 노드가 맨 마지막 위치에 삽입
        else if (current == null) {
            prev.setNextNode(newNode);
            newNode.setPrevNode(prev);
            sentinel.setLastNode(newNode);
        }
        // mid insert : 새 노드가 중간 위치에 삽입
        else {
            newNode.setPrevNode(prev);
            newNode.setNextNode(current);
            prev.setNextNode(newNode);
            current.setPrevNode(newNode);
        }
    }

    // a method that removes a node from the list
    public Node remove(int data) {
        Node current = sentinel.getFirstNode();
        Node prev = null;

        while (current != null && data != current.getData()) {
            prev = current;
            current = current.getNextNode();
        }

        // remove first : 삭제 대상이 맨 첫번째 노드
        if (sentinel.getFirstNode() == current) {
            // 기존의 두번째 노드의 이전 노드를 null
            Node secondNode = current.getNextNode();
            secondNode.setPrevNode(null);
            sentinel.setFirstNode(secondNode);
        }
        // remove last : 삭제 대상이 맨 마지막 노드
        else if (current.getNextNode() == null) {
            prev.setNextNode(null);
            sentinel.setLastNode(prev);
        }
        // remove mid : 삭제 대상이 중간 노드
        else {
            Node nextNode = current.getNextNode();
            prev.setNextNode(nextNode);
            nextNode.setPrevNode(prev);
        }
        return null;
    }

    public String printList() {
        String str = "[ ";
        Node current = sentinel.getFirstNode();
        while (current != null) {
            str += current.getData();
            current = current.getNextNode();

            if (current != null) {
                str += ", ";
            }
        }
        str += " ]";
        return str;
    }
}
