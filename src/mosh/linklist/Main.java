package mosh.linklist;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Object> list  = new LinkedList<>();
        list.addLast(10);
        list.addFirst(5);
        list.add(8);
        System.out.println(list.contains(2));
        System.out.println(list.indexOf(5));
        System.out.println(list.size());
        var array  = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
