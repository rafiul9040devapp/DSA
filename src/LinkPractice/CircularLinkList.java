package LinkPractice;

public class CircularLinkList {

    private CircularNode head;
    private CircularNode tail;

    public CircularLinkList() {
        this.head = null;
        this.tail = null;
    }

    //inserting value in the Link List
    public void insertInTheList(int val){
        CircularNode newNode = new CircularNode(val);

        if (head==null){
            head = newNode;
            tail = newNode;
            return;
        }

        tail.nextNode = newNode;
        newNode.nextNode = head;
        tail = newNode;
    }

    //delete a node with the value
    public void deleteTheNodeInTheList(int val){
        CircularNode temp = head;

        if (temp==null){
            return;
        }
        if (temp.value == val){
            head = head.nextNode;
            tail.nextNode = head;
            return;
        }

        do {
            CircularNode newNext = temp.nextNode; //keeping the current value
            if (newNext.value ==val){
                temp.nextNode = newNext.nextNode; //making the relation between the previous and next
                break;
            }
            temp = temp.nextNode;
        }while (temp!= head);
    }

    //find the node in the link list
    public CircularNode findTheNode(int val){
        CircularNode temp = head;
        do {
            if (temp.value ==val){
                return temp;
            }
            temp = temp.nextNode;
        }while (temp!=head);

        return null;
    }

    //Display the circular list
    public void displayList(){
        CircularNode temp = head;
        if (head!=null){
            do {
                System.out.print(temp.value+" -> ");
                temp = temp.nextNode;
            }while (temp!=head);
        }
        System.out.println("HEAD");
    }

    private class CircularNode{
        private int value;
        CircularNode nextNode;

        public CircularNode(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        CircularLinkList cLL = new CircularLinkList();

        cLL.insertInTheList(5);
        cLL.insertInTheList(4);
        cLL.insertInTheList(3);
        cLL.insertInTheList(2);
        cLL.displayList();

        cLL.deleteTheNodeInTheList(2);
        cLL.displayList();
    }
}
