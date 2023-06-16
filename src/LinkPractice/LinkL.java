package LinkPractice;

public class LinkL {
    //every link list is consist of Nodes
    //it must have a Head NODE
    //and also a tail node
    private Node head;
    private Node tail;
    private int size;

    public LinkL() {
        this.size = 0;
    }

    //insertion methods of Link List

    //Inserting Through The HEAD NODE
    public void insertThroughHead(int value){
        //this method is going to insert the value in LL Through the head
        //every insertion will be the new head of the link list
        Node newHeadNode = new Node(value);
        newHeadNode.next = head; //referencing the old head in the LL
        head = newHeadNode; //new head is assigned

        if (tail==null){
            tail=head;
        }
        size++;
    }

    //Inserting Through The Tail NODE
    public void insertThroughTail(int value){
        if (tail==null){
            insertThroughHead(value);
            return;
            //there is no need to execute the rest of the method and so the return is called
        }
        Node newTailNode = new Node(value);
        tail.next = newTailNode;
        tail = newTailNode;
        size++;

    }

    //Inserting Between The Nodes
    public void insertBetweenNodes(int value,int indexOfNode){
        if (indexOfNode==0){
            insertThroughHead(value);
            return;
        }
        if (indexOfNode==size){
            insertThroughTail(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i <indexOfNode ; i++) {
            temp = temp.next; //getting the previous node in order to insert the new one after that
        }

        //after the getting the previous new node is needed to be created
        Node newBetweenNode = new Node(value,temp.next); //in this temp it is indicating the next node
        temp.next = newBetweenNode; //relation is created with the new one
        size++;

    }

    //Delete Through the HEAD NODE
    public int deleteThroughHead(){
        int valueOfPreviousHead = head.valueOfNode;
        head = head.next; //New Head is assigned and Link is cut off
        if (head==null){ //after the deleting the value if LL becomes null
            tail=null;
        }
        size--;
        return valueOfPreviousHead;
    }

    //Delete Through The Tail Node
    public int deleteThroughTail(){
        if (tail==null){
            return deleteThroughHead();
        }
        Node newTail = getIndex(size-2);
        int value = tail.valueOfNode; //value of deleted tail
        tail = newTail; //new tail is assigned
        tail.next = null;
        size--;
        return value; //deleted value is returned
    }

    //Delete Between the Nodes
    public int deleteBetweenNodes(int index){
        if (index==0){
            return deleteThroughHead();
        }
        if (index==size-1){
            return deleteThroughTail();
        }

        //find the previous NODE of the DELETED index
        Node previousNode = getIndex(index-1); //previous is founded
        int value = previousNode.next.valueOfNode;//deleted value
        previousNode.next = previousNode.next.next; //link is made
        size--;
        return value;
    }

    //It is required to find the index of newTail OR Previous
    public Node getIndex(int indexOfPrevious){
        //previous of tail is required to delete the tail
        Node temp = head;
        for (int i = 1; i <=indexOfPrevious ; i++) {
            temp = temp.next;
        }
        return temp; //the new tail is returned
    }

    //Find any Node Value in the link List
    public Node findTheNodeValue(int value){
        Node temp = head;
        while (temp!=null){
            if (temp.valueOfNode==value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    //Dispalying the LL
    public void displayLL(){
        Node temp = head; //can't iterate through head because it will disorder the link list
        while (temp!=null){
            System.out.print(temp.valueOfNode+" -> ");
            temp = temp.next; //it is referring the next node
        }
        System.out.println("END");
    }
}
