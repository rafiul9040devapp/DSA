package LinkList;

public class Main {
    public static void main(String[] args) {
        LL linkList = new LL();

        linkList.insertFirst(3);
        linkList.insertFirst(5);
        linkList.insertFirst(8);
        linkList.insertFirst(17);
        linkList.display();

        System.out.println();
        linkList.insert(9,2);
        linkList.display();

        System.out.println();
        linkList.insertLast(2);
        linkList.insertLast(1);
        linkList.display();

        System.out.println();
        linkList.insertFirst(19);
        linkList.insertFirst(21);
        linkList.display();

        System.out.println();
        System.out.println(linkList.deleteFirst());
        linkList.display();

        System.out.println();
        System.out.println(linkList.deleteLast());
        linkList.display();

        System.out.println();
        System.out.println(linkList.delete(2));
        linkList.display();

        System.out.println();
        System.out.println(linkList.getNode(5));

    }
}
