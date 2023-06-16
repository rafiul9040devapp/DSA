package LinkPractice;

public class DoublyLinkList {
      private DoublyNode head;
      private DoublyNode tail;
      private int size;

    public DoublyLinkList() {
        this.size = 0;
    }

    //inserting value through the HEAD
     public void insertThroughTheHead(int value){
         DoublyNode newHead = new DoublyNode(value);
         newHead.nextNode = head;
         newHead.previousNode = null;
         if (head!= null){
             //need to check the null pointer exception
             head.previousNode = newHead;
         }
         head = newHead;
         if (tail==null){
             tail = head;
         }
         size++;
     }

     //inserting value through the TAIL
    public void insertThroughTheTail(int value){
        if (tail==null){
            insertThroughTheHead(value);
            return;
        }
        DoublyNode newTail = new DoublyNode(value);
        newTail.previousNode = tail;
        newTail.nextNode = null;
        tail.nextNode = newTail;
        tail = newTail;
        size++;
    }

    //inserting value through the LAST If I don't have TAIL
    public void insertThroughTheLast(int value){
        DoublyNode newTail = new DoublyNode(value);
        newTail.nextNode = null; //newTail is setting up

        if (head ==null){ //for the null DLL tail is the new head
            newTail.previousNode = null;
            head = newTail;
            return;
        }

        DoublyNode last = head;

        while (last.nextNode!= null){
            last = last.nextNode;     //finding the last node
        }
        //assigning the new node
        newTail.previousNode = last;
        last.nextNode = newTail;
        last = newTail;

        size++;
    }

    //inserting value between the nodes in the Doubly
    public void insertBetweenTheNodes(int value,int index){
        DoublyNode newNode = new DoublyNode(value);
        DoublyNode previousOfInsert = findThePreviousNode(index);

        //now the swaping started
        //try to start swaping from the newNode
        newNode.nextNode = previousOfInsert.nextNode;
        previousOfInsert.nextNode = newNode; // the relation between the nodes is break
        newNode.previousNode = previousOfInsert;
        if (newNode.nextNode!=null){
            newNode.nextNode.previousNode = newNode;
        }
    }

    //inserting a new node after the value in the Doubly
    public void insertAfterValue(int afterValue,int newNodeValue){
        DoublyNode previousOfTheInsert = findTheNodeOfTheValue(afterValue);
        if (previousOfTheInsert == null){
            System.out.println("Does Not exists");
            return;
        }
        DoublyNode newNode = new DoublyNode(newNodeValue);
        //swapping started
        //start form the newNode
        newNode.nextNode = previousOfTheInsert.nextNode; //relation is break
        previousOfTheInsert.nextNode = newNode;
        newNode.previousNode = previousOfTheInsert;
        if (newNode.nextNode!=null){
            newNode.nextNode.previousNode = newNode;
        }

    }


    //Finding the value in the node
    public DoublyNode findTheNodeOfTheValue(int value){
        DoublyNode temp = head;
        while (temp!=null){
            if (temp.valueOfNode == value){
                return temp;
            }
            temp = temp.nextNode;
        }
        return null;
    }


    //Finding the previous node for the insertion between
    public DoublyNode findThePreviousNode(int index){
        DoublyNode previous = head;

        for (int i = 1; i <index ; i++) {
            previous = previous.nextNode;
        }
        return previous;
    }

     //display the Doubly Link List
    public void displayDoublyLL(){
         DoublyNode temp = head;
         DoublyNode lastNode = null;
        while (temp!=null) {
            System.out.print(temp.valueOfNode+" -> ");
            lastNode = temp;
            temp = temp.nextNode; //in the end the temp is going to be null and so the last node is counted separately
        }
        System.out.println("END");

        System.out.println("Print Reverse: ");
        while (lastNode!=null){
            System.out.print(lastNode.valueOfNode+" -> ");
            lastNode = lastNode.previousNode;
        }
        System.out.println("START");
    }


      private class DoublyNode {
         protected int valueOfNode;
         protected DoublyNode nextNode;
         protected DoublyNode previousNode;

         public DoublyNode(int valueOfNode) {
             this.valueOfNode = valueOfNode;
         }

         public DoublyNode(DoublyNode nextNode, DoublyNode previousNode) {
             this.nextNode = nextNode;
             this.previousNode = previousNode;
         }

         public DoublyNode(int valueOfNode, DoublyNode nextNode, DoublyNode previousNode) {
             this.valueOfNode = valueOfNode;
             this.nextNode = nextNode;
             this.previousNode = previousNode;
         }
     }

    public static void main(String[] args) {
        DoublyLinkList dLL = new DoublyLinkList();

        dLL.insertThroughTheHead(7);
        dLL.insertThroughTheHead(3);
        dLL.insertThroughTheHead(8);
        dLL.insertThroughTheHead(9);
        dLL.displayDoublyLL();

        dLL.insertThroughTheTail(15);
        dLL.insertThroughTheTail(12);
        dLL.insertThroughTheTail(11);
        dLL.displayDoublyLL();

        dLL.insertThroughTheLast(10);
        dLL.insertThroughTheLast(19);
        dLL.insertThroughTheLast(14);
        dLL.displayDoublyLL();

        dLL.insertBetweenTheNodes(55,5);
        dLL.displayDoublyLL();

        dLL.insertAfterValue(3,4);
        dLL.insertAfterValue(19,16);
        dLL.displayDoublyLL();
    }
}
