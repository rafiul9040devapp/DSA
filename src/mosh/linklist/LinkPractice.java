package mosh.linklist;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkPractice {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int value) {
        var newNode = new Node(value);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(int value) {
        var newNode = new Node(value);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode; //new node will come after the previous tail node
            tail = newNode;
        }
        size++;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void removeFromFirst() {
        if (isEmpty()) throw new NoSuchElementException();//empty list
        if (head == tail) {
            //one element in the list
            head = tail = null;
        } else {
            //regular case
            var newHead = head.next;
            head.next = null;
            head = newHead;
        }
        size--;
    }

    public void removeFromLast() {
        if (isEmpty()) throw new NoSuchElementException();
        if (head == tail) {
            head = tail = null;
        } else {
            tail = getPreviousNode(tail);
            assert tail != null;
            tail.next = null;
        }
        size--;
    }

    private Node getPreviousNode(Node node) {
        var current = head;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public void addBetweenNodes(int value, int indexOfNode) {
        if (indexOfNode == 0) {
            addFirst(value);
            return;
        }
        if (indexOfNode == size) {
            addLast(value);
            return;
        }

        var current = head;
        for (int i = 0; i < indexOfNode-1; i++) {
            current = current.next; //previous reference Node
        }
        current.next = new Node(value, current.next);//new reference Node
        size++;
    }

    public void removeBetweenNodes(int indexOfNodes){
        if (indexOfNodes==0){
            removeFromFirst();
            return;
        }
        if (indexOfNodes==size-1){
            removeFromLast();
            return;
        }
        var current = head;
        for (int i = 0; i < indexOfNodes-1; i++) {
            current = current.next; //previous node
        }
        current.next = current.next.next;
        size--;
    }

    public int indexOf(int value) {
        int index = 0;
        var current = head;
        while (current != null) {
            if (current.value == value) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean isContains(int value) {
        return indexOf(value) != -1;
    }

    public int[] toArray(){
        int[] array = new int[size];
        int index =0;
        var current = head;
        while (current!=null){
            array[index++] = current.value;
            current =current.next;
        }
        return array;
    }

    public int size(){
        return size;
    }

    public void displayLinkList() {
        var current = head;
        while (current != null) {
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public static void main(String[] args) {
        LinkPractice linkList = new LinkPractice();

        linkList.addFirst(15);
        linkList.addFirst(10);
        linkList.addFirst(5);

        linkList.addLast(20);
        linkList.addLast(25);
        linkList.addLast(30);

        linkList.removeFromFirst();
        linkList.removeFromLast();
        linkList.removeFromLast();

        linkList.displayLinkList();

        linkList.addBetweenNodes(35, 2);
        linkList.addBetweenNodes(25, 2);
        linkList.displayLinkList();

        linkList.removeBetweenNodes(2);
        linkList.displayLinkList();

        System.out.println(linkList.indexOf(2));
        System.out.println(linkList.indexOf(35));
        System.out.println(linkList.indexOf(15));
        System.out.println(linkList.isContains(5));

        System.out.println(Arrays.toString(linkList.toArray()));

        System.out.println(linkList.size());
    }
}
