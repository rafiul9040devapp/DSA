package mosh.linklist;

import com.sun.nio.sctp.IllegalReceiveException;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedList {

    private static class Node {
        private int value;
        private Node next;//reference of the next node

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first; //head of the link list
    private Node last; //tail of the link list
    private int size;

    //methods to perform
    //addFirst
    public void addFirst(int item) {
        var node = new Node(item);
        //if list is empty
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node; //new first is initialize
        }
        size++;
    }

    //addLast
    public void addLast(int item) {
        var node = new Node(item);

        //if our List is empty
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node; //initializing the new LAST
        }
        size++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    //deleteFirst
    public void removeFirst() {
        if (isEmpty()) throw new NoSuchElementException(); //for empty list

        if (first == last) {
            first = last = null;
        } else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    //deleteLast
    public void removeLast() {
        if (isEmpty()) throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
            return;
        } else {
            last = getPreviousNode(last);
            if (last != null) {
                last.next = null; //the link is removed fully
            }
        }

        size--;
    }

    private Node getPreviousNode(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    //indexOf
    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    //contains
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    //size of the link list
    public int sizeofLinkList() {
        return size;
    }

    //converting to array
    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        int index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    //reversing the link list
    public void reverse() {
        if (isEmpty()) return;
        var previous = first;
        var current = first.next;
        while (current != null) {
            var next = current.next; // keeping the reference of the node because after changing the link this
            // reference will be lost
            current.next = previous;

            //shifting the pointers
            previous = current;
            current = next;
        }
        //fixing the first and last nodes
        last = first;
        last.next = null;
        first = previous; //because at this point we are going to get the first point
    }

    public int getKthFromTheLast(int k) {

        if (isEmpty()) throw new IllegalStateException();
        var a = first;
        var b = first;
        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null) throw new IllegalReceiveException();
        }
        while (b != last) {
            a = a.next;
            b = b.next;
        }
        return a.value;
    }

    public int getKthFormTheFirst(int k){
        if (isEmpty()) throw new IllegalStateException();
        var a = first;
        for (int i = 0; i < k - 1; i++) {
            a = a.next;
            if (a==null) throw new IllegalReceiveException();
        }
        return a.value;
    }

    public void displayLinkList(){
        var current = first;
        while (current!=null){
            System.out.print(current.value+"->");
            current = current.next;
        }
        System.out.print("END");
    }

    public static void main(String[] args) {
        var linkList = new LinkedList();

        linkList.addFirst(5);
        linkList.addFirst(10);
        linkList.addFirst(15);

        linkList.addLast(10);
        linkList.addLast(20);
        linkList.addLast(30);

//        linkList.removeFirst();
//        linkList.removeLast();
//        System.out.println(linkList.indexOf(30));
//        System.out.println(linkList.contains(30));

        System.out.println(linkList.sizeofLinkList());

        var array = linkList.toArray();
        System.out.println(Arrays.toString(array));

        linkList.reverse();
        var arrayRev = linkList.toArray();
        System.out.println(Arrays.toString(arrayRev));

//        System.out.println(linkList.getKthFromTheLast(3));

        System.out.println(linkList.getKthFormTheFirst(5));

        linkList.displayLinkList();

    }
}
