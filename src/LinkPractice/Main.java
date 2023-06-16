package LinkPractice;

public class Main {
    public static void main(String[] args) {
        LinkL linkList = new LinkL();

        linkList.insertThroughHead(3);
        linkList.insertThroughHead(5);
        linkList.insertThroughHead(7);
        linkList.insertThroughHead(9);
        linkList.displayLL();

        linkList.insertThroughTail(12);
        linkList.displayLL();

        linkList.insertBetweenNodes(6,2);
        linkList.displayLL();

        System.out.println(linkList.deleteThroughHead());
        linkList.displayLL();

        System.out.println(linkList.deleteThroughTail());
        linkList.displayLL();

        System.out.println(linkList.deleteBetweenNodes(2));
        linkList.displayLL();

        System.out.println(linkList.findTheNodeValue(7).valueOfNode);
    }
}
