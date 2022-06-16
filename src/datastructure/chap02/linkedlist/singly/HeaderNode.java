package datastructure.chap02.linkedlist.singly;

// 연결 리스트의 첫번째 데이터가 들어있는 노드를 저장
public class HeaderNode<E> {
    
    // 첫번째 노드 객체의 주소 저장
    private Node<E> firstNode;

    // Constructor
    public HeaderNode() {
        // creating a header node = creating a new list
        // empty list at first, no firstNode
        this.firstNode = null;
    }

    // 헤더노드의 포인터를 셋팅하는 기능
    public void setFirstNode(Node<E> firstNode) {
        this.firstNode = firstNode;
    }

    // 헤더노드가 감시하는 첫번째 노드의 주소를 반환
    public Node<E> getFirstNode() {
        return firstNode;
    }

    // 연결리스트가 빈 리스트인지 여부 확인
    public boolean isEmpty() {
        return firstNode == null;
    }
}
