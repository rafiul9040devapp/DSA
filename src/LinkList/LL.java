package LinkList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void display() {
        Node temp = head; //in order to keep secure the head we move only the temp
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if (tail==null){
            return deleteFirst();
        }
        Node node = getIndex(size-2);
        int val = tail.value;
        tail = node;
        tail.next=null;
        size--;
        return val;
    }

    public int delete(int index){
        if (index==0){
            return deleteFirst();
        }
        if (index==size-1){
            return deleteLast();
        }
        Node prev = getIndex(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node getIndex(int index){
        Node node = head;
        for (int i = 1; i <=index ; i++) {
            node = node.next;
        }
        return node;

    }
    public Node getNode(int val){
        Node node = head;
       while (node != null){
           if (node.value == val){
               return node;
           }
           node = node.next;
       }
        return null;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int val) {
            this.value = val;
        }

        public Node(int val, Node next) {
            this.value = val;
            this.next = next;
        }
    }
}
