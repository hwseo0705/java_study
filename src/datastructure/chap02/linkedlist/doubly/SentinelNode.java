package datastructure.chap02.linkedlist.doubly;

public class SentinelNode {
    private Node firstNode;
    private Node lastNode;

    // isEmpty()
    public boolean isEmpty() {
        return firstNode == null && lastNode == null;
    }

    public Node getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node node) {
        this.firstNode = node;
    }

    public Node getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node lastNode) {
        this.lastNode = lastNode;
    }
}
