package linkedlist;
public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList() ;
        myLinkedList.append(3);
        myLinkedList.prepend(1);
        myLinkedList.PrintList();
        System.out.println(myLinkedList.get(1).value);

    }
}
