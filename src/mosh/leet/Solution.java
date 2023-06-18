package mosh.leet;

public class Solution {
     private class ListNode {
         private int value;
         private ListNode next;

         public ListNode(int value) {
             this.value = value;
         }
     }

     private ListNode head;
     private ListNode tail;

     public ListNode reverseList(){
         var previous = head;
         var current = head.next;

         while (current!=null){
             var next = current.next;
             current.next = previous;
             previous =current;
             current = next;
         }
         tail = head;
         tail.next = null;
         head = previous;
         return previous;
     }

     private boolean isEmpty(){
         return head == null;
     }
}
