package LinkPractice;

public class Node {
    protected int valueOfNode;
    protected Node next;

    public Node(int value) {
        this.valueOfNode = value;
    }

    public Node(int value, Node next) {
        this.valueOfNode = value;
        this.next = next;
    }
}
