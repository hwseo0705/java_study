package datastructure.chapter05.queue;

class QueueNode {
    private int item;
    private QueueNode link;

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public QueueNode getLink() {
        return link;
    }

    public void setLink(QueueNode link) {
        this.link = link;
    }
}

public class Queue {

    private QueueNode front;
    private QueueNode rear;

    public Queue() {
        front = new QueueNode();
        rear = new QueueNode();
    }

    // check if the queue is empty
    public boolean isEmpty() {
        return front.getLink() == null;
    }

    // add to rear
    public void add(int item) {
        // create newNode
        QueueNode newNode = new QueueNode();
        newNode.setItem(item); // 새 노드에 자료 저장
    
        if (isEmpty()) { // 첫번째 노드가 저장되는 경우
            front.setLink(newNode);
            rear.setLink(newNode);
        } else { // 기존 노드에 연결되는 경우
            // 추가 되기 전 마지막 노드
            QueueNode lastNode = rear.getLink();
            lastNode.setLink(newNode);
            rear.setLink(newNode);
        }
    }

    // remove from queue (front)
    public Integer poll() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return null;
        } else {
            // node to delete
            QueueNode delTarget = front.getLink();
            // front points to the node that delTarget is pointing to
            front.setLink(delTarget.getLink());
            return delTarget.getItem();
        }
    }
}
